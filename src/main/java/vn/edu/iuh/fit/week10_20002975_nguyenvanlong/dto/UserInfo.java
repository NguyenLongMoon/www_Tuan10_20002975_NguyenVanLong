package vn.edu.iuh.fit.week10_20002975_nguyenvanlong.dto;

public record UserInfo(String username, String password, boolean enabled, String[] authorities) {}
