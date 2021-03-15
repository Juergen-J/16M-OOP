package homework16.application;

import com.sun.xml.internal.bind.v2.TODO;
import homework16.interfaces.IPrintable;
import homework16.items.*;

public class MassMediaAppl {
    public static void main(String[] args) {
        MassMedia[] mmArr = {
                new Journal("Journal1", 1, 44, true),
                new Journal("Journal2", 2, 46, false),
                new Journal("Journal3", 3, 48, true),
                new Journal("Journal4", 4, 40, true),
                new Journal("Journal5", 5, 56, false),
                new Journal("Journal6", 6, 80, true),
                new Journal("Journal7", 7, 24, false),
                new Journal("Journal8", 8, 58, false),
                new Journal("Journal9", 9, 32, true),
                new Journal("Journal10", 10, 24, true),
                new Newspaper("News Paper1", 11, 8),
                new Newspaper("News Paper2", 12, 6),
                new Newspaper("News Paper3", 13, 10),
                new Newspaper("News Paper4", 14, 4),
                new Newspaper("News Paper5", 15, 45),
                new Newspaper("News Paper6", 16, 12),
                new Newspaper("News Paper7", 17, 6),
                new Newspaper("News Paper8", 18, 20),
                new Newspaper("News Paper9", 19, 18),
                new Newspaper("News Paper10", 20, 24),
                new WebSite("Web-Site1", "www.web.com", "Author1"),
                new WebSite("Web-Site2", "www.web.com", "Author2"),
                new WebSite("Web-Site3", "www.web.com", "Author3"),
                new WebSite("Web-Site4", "www.web.com", "Author4"),
                new WebSite("Web-Site5", "www.web.com", "Author5"),
                new WebSite("Web-Site6", "www.web.com", "Author6"),
                new WebSite("Web-Site7", "www.web.com", "Author7"),
                new WebSite("Web-Site8", "www.web.com", "Author8"),
                new WebSite("Web-Site9", "www.web.com", "Author9"),
                new WebSite("Web-Site10", "www.web.com", "Author10"),
        };

        displayPrintable(mmArr);

        IPrintable[] ipArr = getPrintableElements(mmArr);
        System.out.println(ipArr.length);
    }

    private static void displayPrintable(MassMedia[] ar) {
        for (MassMedia o : ar) {
            if (o instanceof IPrintable) {
                ((IPrintable) o).print();
            }

        }
    }

    // TODO: 15.03.2021  не уверен что метод работает правилбно, т.к. новый массив заполняется не новыми обьектами, а использует ссылки
    //на обьекты из первого массива. Возможно создание вспомогательного метода могло бы решить проблему.
    private static IPrintable[] getPrintableElements(MassMedia[] ar) {
        int length = 0;
        for (MassMedia o : ar) {
            if (o instanceof IPrintable)
                length++;
        }
        IPrintable[] result = new IPrintable[length];

        int tempI = 0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] instanceof IPrintable) {
                result[tempI] = (IPrintable) ar[i];
                tempI++;
            }
        }
        return result;
    }
}
