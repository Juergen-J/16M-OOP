package homework29.app;

import homework29.dto.*;
import homework29.interfaces.IPrintable;

public class MassMediaAppl {
    public static void main(String[] args) {

    }

    private static void displayPrintable(MassMedia[] ar) {
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] instanceof IPrintable) {
                ((IPrintable) ar[i]).print();
            }
        }
    }

    private static IPrintable[] getPrintableElements(MassMedia[] ar) {
        IPrintable[] arr;
        int length = 0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] instanceof IPrintable) {
                length++;
            }
        }
        arr = new IPrintable[length];
        length--;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] instanceof IPrintable) {
                arr[length--] = (IPrintable) ar[i];
            }
        }
        return arr;
    }

}
