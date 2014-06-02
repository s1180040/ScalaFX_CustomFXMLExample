package org.zukkey40.example.scalafx.custom_fxml.controller

import scalafx.Includes._
import javafx.fxml.{Initializable, FXMLLoader, FXML}
import javafx.scene.control.{Button => jfxButton, PasswordField => jfxPasswordField, TextField => jfxTextField}
import scalafx.scene.control.{Button => sfxButton, PasswordField => sfxPasswordField, TextField => sfxTextField}
import java.net.URL
import java.util.ResourceBundle
import scalafx.event.ActionEvent
import javafx.scene.layout.{AnchorPane => jfxAnchorPane}

/**
 * Created with IntelliJ IDEA.
 * User: zuk_key
 * Date: 2014/06/01
 * To change this template use File | Settings | File Templates.
 */
class LoginController(val okButtonClickedMessage: String) extends jfxAnchorPane with Initializable{
  @FXML private var jfxUsernameField: jfxTextField = null
  @FXML private var jfxPasswordField: jfxPasswordField = null
  @FXML private var jfxOkButton: jfxButton = null
  @FXML private var jfxCancelButton: jfxButton = null

  private var sfxUsernameField: sfxTextField = null
  private var sfxPasswordField: sfxPasswordField = null
  private var sfxOkButton: sfxButton = null
  private var sfxCancelButton: sfxButton = null

  val fxmlLoader: FXMLLoader = new FXMLLoader(getClass.getResource("../view/Login.fxml"))
  fxmlLoader.setRoot(this)
  fxmlLoader.setController(this)
  fxmlLoader.load

  def initialize(url: URL, resourceBundle: ResourceBundle){
    jfxUsernameField = lookup("#jfxUsernameField").asInstanceOf[jfxTextField]
    jfxPasswordField = lookup("#jfxPasswordField").asInstanceOf[jfxPasswordField]
    jfxOkButton = lookup("#jfxOkButton").asInstanceOf[jfxButton]
    jfxCancelButton = lookup("#jfxCancelButton").asInstanceOf[jfxButton]

    sfxUsernameField = new sfxTextField(jfxUsernameField)
    sfxPasswordField = new sfxPasswordField(jfxPasswordField)
    sfxOkButton = new sfxButton(jfxOkButton)
    sfxCancelButton = new sfxButton(jfxCancelButton)

    sfxOkButton.onAction = (_: ActionEvent) => {
      println(okButtonClickedMessage)
    }
  }
}
