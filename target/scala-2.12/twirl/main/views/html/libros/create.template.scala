
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

object create extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[Libro],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(libroForm : Form[Libro]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/layout("Libreria")/*4.20*/{_display_(Seq[Any](format.raw/*4.21*/("""
    """),format.raw/*5.5*/("""<h1>Crear Libro</h1>
    """),_display_(/*6.6*/helper/*6.12*/.form(action = helper.CSRF(routes.LibroController.save()))/*6.70*/{_display_(Seq[Any](format.raw/*6.71*/("""
        """),_display_(/*7.10*/helper/*7.16*/.inputText(libroForm("id"))),format.raw/*7.43*/("""
        """),_display_(/*8.10*/helper/*8.16*/.inputText(libroForm("title"))),format.raw/*8.46*/("""
        """),_display_(/*9.10*/helper/*9.16*/.inputText(libroForm("price"))),format.raw/*9.46*/("""
        """),_display_(/*10.10*/helper/*10.16*/.inputText(libroForm("author"))),format.raw/*10.47*/("""
        """),format.raw/*11.9*/("""<input type="submit" value="Crear libro">
    """)))}),format.raw/*12.6*/("""
""")))}),format.raw/*13.2*/("""
"""))
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
                  SOURCE: /Users/tonny_jho/Documents/playframework/java-crud/app/views/libros/create.scala.html
                  HASH: 9628ac2ce73c10c1d979ba7dd33c9f83dd8898ba
                  MATRIX: 961->1|1059->28|1103->44|1130->46|1156->64|1194->65|1225->70|1276->96|1290->102|1356->160|1394->161|1430->171|1444->177|1491->204|1527->214|1541->220|1591->250|1627->260|1641->266|1691->296|1728->306|1743->312|1795->343|1831->352|1908->399|1940->401
                  LINES: 28->1|31->2|34->3|35->4|35->4|35->4|36->5|37->6|37->6|37->6|37->6|38->7|38->7|38->7|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|42->11|43->12|44->13
                  -- GENERATED --
              */
          