
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

object layout extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(body: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<html>
    <head>
        <title>"""),_display_(/*4.17*/title),format.raw/*4.22*/("""</title>
    </head>
    <body>
        """),_display_(/*7.10*/body),format.raw/*7.14*/("""
    """),format.raw/*8.5*/("""</body>
</html>"""))
      }
    }
  }

  def render(title:String,body:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(body)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (body) => apply(title)(body)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Jul 22 20:54:08 CDT 2018
                  SOURCE: /Users/tonny_jho/Documents/playframework/java-crud/app/views/libros/layout.scala.html
                  HASH: 7ab90d45c74376e937a4747a2f5a66867c24b115
                  MATRIX: 961->1|1082->29|1142->63|1167->68|1234->109|1258->113|1289->118
                  LINES: 28->1|33->2|35->4|35->4|38->7|38->7|39->8
                  -- GENERATED --
              */
          