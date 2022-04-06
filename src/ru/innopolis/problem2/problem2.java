// Had to put all these in one file for technical reasons

interface LightningPort {
        void chargeByLightning();
}

interface UsbPort {
        void chargeByUsb();
}

class iPhone implements LightningPort {
        public void chargeByLightning() {
                System.out.println("iPhone charging via LightningPort");
        }
}

class Android implements UsbPort {
        public void chargeByUsb() {
                System.out.println("Android charging via USB");
          }
}

class ChargerStation {
    public void chargeByLightning(LightningPort lightningPort){
        lightningPort.chargeByLightning();
    }
}

class UsbToLightningPortAdapter implements LightningPort {
        public UsbPort usb_chargable_device;

        public UsbToLightningPortAdapter(UsbPort usb_chargable_device) {
                this.usb_chargable_device = usb_chargable_device;
        }

        public void chargeByLightning() {
                System.out.print("Adapting USB-chargable for LightningPort: ");
                usb_chargable_device.chargeByUsb();
        }
}

public class problem2 {
        public static void main(String[] args) {
                iPhone phone1 = new iPhone();
                Android phone2 = new Android();

                // Check usual charging
                phone1.chargeByLightning();
                phone2.chargeByUsb();

                // Adapt android phone for lightning:
                UsbToLightningPortAdapter phone2_with_adapter = new UsbToLightningPortAdapter(phone2);
                phone2_with_adapter.chargeByLightning();
        }
}
