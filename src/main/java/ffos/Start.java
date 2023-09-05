/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ffos;

import ffos.util.HibernateUtil;
import ffos.view.Izbornik;



/**
 *
 * @author dell
 */
public class Start {

    // za ORM generalno čitati https://github.com/tjakopec/ORM_JAVA_PHP_CSHARP
    public static void main(String[] args) {
        //HibernateUtil.getSession();
        new Izbornik().setVisible(true);
    }
}
