package com.cathy.blog2.data;

public class Users {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.uid
     *
     * @mbg.generated Fri Jun 29 17:23:09 CST 2018
     */
    private Integer uid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.username
     *
     * @mbg.generated Fri Jun 29 17:23:09 CST 2018
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.PASSWORD
     *
     * @mbg.generated Fri Jun 29 17:23:09 CST 2018
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.email
     *
     * @mbg.generated Fri Jun 29 17:23:09 CST 2018
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.home_url
     *
     * @mbg.generated Fri Jun 29 17:23:09 CST 2018
     */
    private String homeUrl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.screen_name
     *
     * @mbg.generated Fri Jun 29 17:23:09 CST 2018
     */
    private String screenName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.created
     *
     * @mbg.generated Fri Jun 29 17:23:09 CST 2018
     */
    private Integer created;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.activated
     *
     * @mbg.generated Fri Jun 29 17:23:09 CST 2018
     */
    private Integer activated;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.logged
     *
     * @mbg.generated Fri Jun 29 17:23:09 CST 2018
     */
    private Integer logged;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.group_name
     *
     * @mbg.generated Fri Jun 29 17:23:09 CST 2018
     */
    private String groupName;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHomeUrl() {
        return homeUrl;
    }

    public void setHomeUrl(String homeUrl) {
        this.homeUrl = homeUrl;
    }

    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    public Integer getCreated() {
        return created;
    }

    public void setCreated(Integer created) {
        this.created = created;
    }

    public Integer getActivated() {
        return activated;
    }

    public void setActivated(Integer activated) {
        this.activated = activated;
    }

    public Integer getLogged() {
        return logged;
    }

    public void setLogged(Integer logged) {
        this.logged = logged;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
}