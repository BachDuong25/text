/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

/**
 *
 * @author ADMIN
 */
public class Validate {
    public boolean checkPhone(String phone) throws Exception {
        String regex = "^09\\d{8}$";
        if (phone.matches(regex)) {
            return true;
        } else {
            throw new Exception("Phone has a length of 10, must start with 09...");
        }
    }
//------------------------------------------------------------

    public boolean checkName(String name) throws Exception {
        String regex = "^[A-Za-z\\s]+$";
        if (name.matches(regex)) {
            return true;
        } else {
            throw new Exception("It must not contain any number or special character");
        }
    }
//------------------------------------------------------------

    public boolean checkID(String id) throws Exception {
        String regex = "De\\d{2}";
            if (id.matches(regex)) {
                return true;
            } else {
                throw new Exception("It must be like this form(Dexx)");
            }
    }
    
    public int checkNum(String num) throws Exception {
        int value = Integer.parseInt(num);
        if (value < 0 || value > 9) throw new Exception("Out of range");
        return value;
    }
//------------------------------------------------------------

    
}
