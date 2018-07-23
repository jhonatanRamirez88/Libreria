
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Set[Libro],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(libros : Set[Libro]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""

"""),_display_(/*4.2*/layout("Libreria")/*4.20*/{_display_(Seq[Any](format.raw/*4.21*/("""
    """),format.raw/*5.5*/("""<h1>Libros Index</h1>
    """),_display_(/*6.6*/for(libro <- libros) yield /*6.26*/{_display_(Seq[Any](format.raw/*6.27*/("""
        """),format.raw/*7.9*/("""<a href=""""),_display_(/*7.19*/routes/*7.25*/.LibroController.show(libro.id)),format.raw/*7.56*/("""">"""),_display_(/*7.59*/libro/*7.64*/.title),format.raw/*7.70*/("""</a>
        <p>"""),_display_(/*8.13*/libro/*8.18*/.price),format.raw/*8.24*/("""</p>
        <p>"""),_display_(/*9.13*/libro/*9.18*/.author),format.raw/*9.25*/("""</p>
    """)))}),format.raw/*10.6*/("""
    """),format.raw/*11.5*/("""<a href=""""),_display_(/*11.15*/routes/*11.21*/.LibroController.create()),format.raw/*11.46*/("""">Crear libro</a>
""")))}))
      }
    }
  }

  def render(libros:Set[Libro]): play.twirl.api.HtmlFormat.Appendable = apply(libros)

  def f:((Set[Libro]) => play.twirl.api.HtmlFormat.Appendable) = (libros) => apply(libros)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Jul 22 20:54:09 CDT 2018
                  SOURCE: /Users/tonny_jho/Documents/playframework/java-crud/app/views/libros/index.scala.html
                  HASH: 723810eae91d8ccf0a40de8fd148d88189245f8d
                  MATRIX: 959->1|1074->23|1102->26|1128->44|1166->45|1197->50|1249->77|1284->97|1322->98|1357->107|1393->117|1407->123|1458->154|1487->157|1500->162|1526->168|1569->185|1582->190|1608->196|1651->213|1664->218|1691->225|1731->235|1763->240|1800->250|1815->256|1861->281
                  LINES: 28->1|33->2|35->4|35->4|35->4|36->5|37->6|37->6|37->6|38->7|38->7|38->7|38->7|38->7|38->7|38->7|39->8|39->8|39->8|40->9|40->9|40->9|41->10|42->11|42->11|42->11|42->11
                  -- GENERATED --
              */
          