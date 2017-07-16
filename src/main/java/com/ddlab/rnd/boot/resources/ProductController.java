//package com.ddlab.rnd.boot.resources;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;
//
//@RestController
//@RequestMapping("/product")
//@Api(value="onlinestore", description="Operations pertaining to products in Online Store")
//public class ProductController {
//   
//    @ApiOperation(value = "Delete a product")
//    @RequestMapping(value="/delete/{id}", method = RequestMethod.DELETE, produces = "application/json")
//    public ResponseEntity delete(@PathVariable Integer id){
//        return new ResponseEntity("Product deleted successfully", HttpStatus.OK);
//
//    }
//
//}
