package org.zukkey40.example.scalafx.custom_fxml

import scalafx.Includes._
import scalafx.application.JFXApp
import scalafx.application.JFXApp.PrimaryStage
import scalafx.scene.Scene
import org.zukkey40.example.scalafx.custom_fxml.controller.LoginController


/**
 * Created with IntelliJ IDEA.
 * User: zuk_key
 * Date: 2014/06/01
 * To change this template use File | Settings | File Templates.
 */
object Main extends JFXApp{
  val root = new LoginController("OK button clicked in custom_fxml")

  stage = new PrimaryStage() {
    title = "FXML example"
    scene = new Scene(root)
  }
}
