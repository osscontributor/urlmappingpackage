package com.myapp

@TestFor(UrlMappings)
@Mock([com.demo.PersonController])
class UrlMappingsTests {
    
    void testUrlMappings() {
        assertForwardUrlMapping('/showPeople', controller: 'person', action: 'list')
    }
}