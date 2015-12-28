import ratpack.handlebars.HandlebarsModule

import static ratpack.groovy.Groovy.ratpack
import static ratpack.handlebars.Template.handlebarsTemplate

ratpack {
  bindings {
    module HandlebarsModule
  }

  handlers {
  	get () {
  		render handlebarsTemplate("index.html", null, "text/html; charset=utf-8 ")	
  	}

  	get (':name.html') {
		render handlebarsTemplate(context.pathTokens['name'] + ".html", null, "text/html; charset=utf-8 ")
  	}
    
    files { dir "public" }
  }
}

