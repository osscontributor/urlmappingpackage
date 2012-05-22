package com.myapp

class UrlMappings {

	static mappings = {
		"/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}

        '/showPeople'(controller: 'person', action: 'list')
		"/"(view:"/index")
		"500"(view:'/error')
	}
}
