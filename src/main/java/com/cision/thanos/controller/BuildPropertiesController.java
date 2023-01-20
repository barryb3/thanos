package com.cision.thanos.controller;//package com.cision.thanos.controller;
//
//import io.micrometer.core.annotation.Timed;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.info.BuildProperties;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
///**
// * Expose a BuildProperties API for display on the react console.
// */
//@RestController
//@RequestMapping("/api")
//public class BuildPropertiesController {
//  private static final Logger logger = LoggerFactory.getLogger(BuildPropertiesController.class);
//
//  @Autowired
//  BuildProperties buildProperties;
//
//  @Timed(value = "buildProperties.time",
//      description = "time taken to return buildProperties result")
//  @GetMapping("/buildProperties")
//  public BuildProperties buildProperties() {
//    return buildProperties;
//  }
//}
