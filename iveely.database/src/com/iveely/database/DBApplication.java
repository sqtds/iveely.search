/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iveely.database;

import com.iveely.database.api.DbConnector;

/**
 * @author liufanping@iveely.com
 */
public class DBApplication {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Engine.getInstance().start(4321);
  }
}
