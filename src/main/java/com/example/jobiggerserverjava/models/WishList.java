package com.example.jobiggerserverjava.models;

import java.util.List;

public class WishList {
  private String username;
  private List<Integer> jobIds;

  public WishList() {
  }

  public WishList(String username, List<Integer> jobIds) {
    this.username = username;
    this.jobIds = jobIds;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public List<Integer> getJobIds() {
    return jobIds;
  }

  public void setJobIds(List<Integer> jobIds) {
    this.jobIds = jobIds;
  }
}