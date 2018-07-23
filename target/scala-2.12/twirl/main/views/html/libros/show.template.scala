
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

object show extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Libro,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(libro: Libro):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/layout("Mostrar Libro")/*3.25*/{_display_(Seq[Any](format.raw/*3.26*/("""
        """),format.raw/*4.9*/("""<h2>"""),_display_(/*4.14*/libro/*4.19*/.title),format.raw/*4.25*/("""</h2>
        <p>Price: """),_display_(/*5.20*/libro/*5.25*/.price),format.raw/*5.31*/("""</p>
        <p>Author: """),_display_(/*6.21*/libro/*6.26*/.author),format.raw/*6.33*/("""</p>
        <a href=""""),_display_(/*7.19*/routes/*7.25*/.LibroController.edit(libro.id)),format.raw/*7.56*/("""">Editar libro</a>
        <a href=""""),_display_(/*8.19*/routes/*8.25*/.LibroController.delete(libro.id)),format.raw/*8.58*/("""">Eliminar libro</a>
    """)))}))
      }
    }
  }

  def render(libro:Libro): play.twirl.api.HtmlFormat.Appendable = apply(libro)

  def f:((Libro) => play.twirl.api.HtmlFormat.Appendable) = (libro) => apply(libro)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Jul 22 20:54:08 CDT 2018
                  SOURCE: /Users/tonny_jho/Documents/playframework/java-crud/app/views/libros/show.scala.html
                  HASH: de5e84696a5f4d307d92cf5dbdfab8d76a00495f
                  MATRIX: 953->1|1061->16|1088->18|1119->41|1157->42|1192->51|1223->56|1236->61|1262->67|1313->92|1326->97|1352->103|1403->128|1416->133|1443->140|1492->163|1506->169|1557->200|1620->237|1634->243|1687->276
                  LINES: 28->1|33->2|34->3|34->3|34->3|35->4|35->4|35->4|35->4|36->5|36->5|36->5|37->6|37->6|37->6|38->7|38->7|38->7|39->8|39->8|39->8
                  -- GENERATED --
              */
          