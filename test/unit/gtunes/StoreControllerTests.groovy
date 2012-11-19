package gtunes



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(StoreController)
class StoreControllerTests {

    void testRenderHomePage() {
        controller.index()
         assert "Welcome to the gTunes store!", 
               controller.response.contentAsString 
    }
}
