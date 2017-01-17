/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;


import java.util.HashMap;
import java.util.Map;

public class Usuario {

    private static final Map<String, Usuario> USERS = new HashMap<String, Usuario>();

    public static Usuario of(String id) {
        Usuario user = USERS.get(id);
        if (user == null) {
            user = new Usuario(id);
            USERS.put(id, user);
        }
        return user;
    }

    private Usuario(String id) {
        this.id = id;
    }
    private String id;

    public String getId() {
        return id;
    }
    private String email = "";
    private String phone = "";
    private boolean subscribed;
    private String address = "";

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return the subscribed
     */
    public boolean isSubscribed() {
        return subscribed;
    }

    /**
     * @param subscribed the subscribed to set
     */
    public void setSubscribed(boolean subscribed) {
        this.subscribed = subscribed;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }
}
