
package views.html.libros

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object edit extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[Libro],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(libroForm : Form[Libro]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](_display_(/*3.2*/layout("Libreria")/*3.20*/{_display_(Seq[Any](format.raw/*3.21*/("""
    """),format.raw/*4.5*/("""<h1>Editar Libro</h1>
    """),_display_(/*5.6*/helper/*5.12*/.form(action = helper.CSRF(routes.LibroController.update()))/*5.72*/{_display_(Seq[Any](format.raw/*5.73*/("""
        """),_display_(/*6.10*/helper/*6.16*/.inputText(libroForm("id"))),format.raw/*6.43*/("""
        """),_display_(/*7.10*/helper/*7.16*/.inputText(libroForm("title"))),format.raw/*7.46*/("""
        """),_display_(/*8.10*/helper/*8.16*/.inputText(libroForm("price"))),format.raw/*8.46*/("""
        """),_display_(/*9.10*/helper/*9.16*/.inputText(libroForm("author"))),format.raw/*9.47*/("""
        """),format.raw/*10.9*/("""<input type="submit" value="Editar libro">
    """)))}),format.raw/*11.6*/("""

""")))}))
      }
    }
  }

  def render(libroForm:Form[Libro]): play.twirl.api.HtmlFormat.Appendable = apply(libroForm)

  def f:((Form[Libro]) => play.twirl.api.HtmlFormat.Appendable) = (libroForm) => apply(libroForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Jul 22 20:54:09 CDT 2018
                  SOURCE: /Users/tonny_jho/Documents/playframework/java-crud/app/views/libros/edit.scala.html
                  HASH: 4a2861912fbd90c162c71485f6be765dcc9009cf
                  MATRIX: 959->1|1057->28|1101->45|1127->63|1165->64|1196->69|1248->96|1262->102|1330->162|1368->163|1404->173|1418->179|1465->206|1501->216|1515->222|1565->252|1601->262|1615->268|1665->298|1701->308|1715->314|1766->345|1802->354|1880->402
                  LINES: 28->1|31->2|34->3|34->3|34->3|35->4|36->5|36->5|36->5|36->5|37->6|37->6|37->6|38->7|38->7|38->7|39->8|39->8|39->8|40->9|40->9|40->9|41->10|42->11
                  -- GENERATED --
              */
          