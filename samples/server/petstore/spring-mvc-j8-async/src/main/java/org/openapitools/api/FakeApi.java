/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.1-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import java.math.BigDecimal;
import org.openapitools.model.Client;
import java.time.LocalDate;
import java.util.Map;
import java.time.OffsetDateTime;
import org.openapitools.model.OuterComposite;
import org.springframework.core.io.Resource;
import org.openapitools.model.User;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

@Api(value = "fake", description = "the fake API")
public interface FakeApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    @ApiOperation(value = "", nickname = "fakeOuterBooleanSerialize", notes = "Test serialization of outer boolean types", response = Boolean.class, tags={ "fake", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Output boolean", response = Boolean.class) })
    @RequestMapping(value = "/fake/outer/boolean",
        produces = { "*/*" }, 
        method = RequestMethod.POST)
    default CompletableFuture<ResponseEntity<Boolean>> fakeOuterBooleanSerialize(@ApiParam(value = "Input boolean as post body"  )  @Valid @RequestBody Boolean body) {
        return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                    if (mediaType.isCompatibleWith(MediaType.valueOf("*/*"))) {
                        ApiUtil.setExampleResponse(request, "*/*", "null");
                        break;
                    }
                }
            });
            return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
        }, Runnable::run);

    }


    @ApiOperation(value = "", nickname = "fakeOuterCompositeSerialize", notes = "Test serialization of object with outer number type", response = OuterComposite.class, tags={ "fake", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Output composite", response = OuterComposite.class) })
    @RequestMapping(value = "/fake/outer/composite",
        produces = { "*/*" }, 
        method = RequestMethod.POST)
    default CompletableFuture<ResponseEntity<OuterComposite>> fakeOuterCompositeSerialize(@ApiParam(value = "Input composite as post body"  )  @Valid @RequestBody OuterComposite outerComposite) {
        return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                    if (mediaType.isCompatibleWith(MediaType.valueOf("*/*"))) {
                        ApiUtil.setExampleResponse(request, "*/*", "{ }");
                        break;
                    }
                }
            });
            return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
        }, Runnable::run);

    }


    @ApiOperation(value = "", nickname = "fakeOuterNumberSerialize", notes = "Test serialization of outer number types", response = BigDecimal.class, tags={ "fake", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Output number", response = BigDecimal.class) })
    @RequestMapping(value = "/fake/outer/number",
        produces = { "*/*" }, 
        method = RequestMethod.POST)
    default CompletableFuture<ResponseEntity<BigDecimal>> fakeOuterNumberSerialize(@ApiParam(value = "Input number as post body"  )  @Valid @RequestBody BigDecimal body) {
        return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                    if (mediaType.isCompatibleWith(MediaType.valueOf("*/*"))) {
                        ApiUtil.setExampleResponse(request, "*/*", "null");
                        break;
                    }
                }
            });
            return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
        }, Runnable::run);

    }


    @ApiOperation(value = "", nickname = "fakeOuterStringSerialize", notes = "Test serialization of outer string types", response = String.class, tags={ "fake", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Output string", response = String.class) })
    @RequestMapping(value = "/fake/outer/string",
        produces = { "*/*" }, 
        method = RequestMethod.POST)
    default CompletableFuture<ResponseEntity<String>> fakeOuterStringSerialize(@ApiParam(value = "Input string as post body"  )  @Valid @RequestBody String body) {
        return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                    if (mediaType.isCompatibleWith(MediaType.valueOf("*/*"))) {
                        ApiUtil.setExampleResponse(request, "*/*", "null");
                        break;
                    }
                }
            });
            return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
        }, Runnable::run);

    }


    @ApiOperation(value = "", nickname = "testBodyWithQueryParams", notes = "", tags={ "fake", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    @RequestMapping(value = "/fake/body-with-query-params",
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    default CompletableFuture<ResponseEntity<Void>> testBodyWithQueryParams(@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "query", required = true) String query,@ApiParam(value = "" ,required=true )  @Valid @RequestBody User user) {
        return CompletableFuture.completedFuture(new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED));

    }


    @ApiOperation(value = "To test \"client\" model", nickname = "testClientModel", notes = "To test \"client\" model", response = Client.class, tags={ "fake", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Client.class) })
    @RequestMapping(value = "/fake",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PATCH)
    default CompletableFuture<ResponseEntity<Client>> testClientModel(@ApiParam(value = "client model" ,required=true )  @Valid @RequestBody Client client) {
        return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                    if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                        ApiUtil.setExampleResponse(request, "application/json", "{  \"client\" : \"client\"}");
                        break;
                    }
                }
            });
            return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
        }, Runnable::run);

    }


    @ApiOperation(value = "Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 ", nickname = "testEndpointParameters", notes = "Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 ", authorizations = {
        @Authorization(value = "http_basic_test")
    }, tags={ "fake", })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid username supplied"),
        @ApiResponse(code = 404, message = "User not found") })
    @RequestMapping(value = "/fake",
        consumes = { "application/x-www-form-urlencoded" },
        method = RequestMethod.POST)
    default CompletableFuture<ResponseEntity<Void>> testEndpointParameters(@ApiParam(value = "None", required=true, defaultValue="null") @RequestParam(value="number", required=true)  BigDecimal number,@ApiParam(value = "None", required=true, defaultValue="null") @RequestParam(value="double", required=true)  Double _double,@ApiParam(value = "None", required=true, defaultValue="null") @RequestParam(value="pattern_without_delimiter", required=true)  String patternWithoutDelimiter,@ApiParam(value = "None", required=true, defaultValue="null") @RequestParam(value="byte", required=true)  byte[] _byte,@ApiParam(value = "None", defaultValue="null") @RequestParam(value="integer", required=false)  Integer integer,@ApiParam(value = "None", defaultValue="null") @RequestParam(value="int32", required=false)  Integer int32,@ApiParam(value = "None", defaultValue="null") @RequestParam(value="int64", required=false)  Long int64,@ApiParam(value = "None", defaultValue="null") @RequestParam(value="float", required=false)  Float _float,@ApiParam(value = "None", defaultValue="null") @RequestParam(value="string", required=false)  String string,@ApiParam(value = "file detail") @Valid @RequestPart("file") MultipartFile binary,@ApiParam(value = "None", defaultValue="null") @RequestParam(value="date", required=false)  LocalDate date,@ApiParam(value = "None", defaultValue="null") @RequestParam(value="dateTime", required=false)  OffsetDateTime dateTime,@ApiParam(value = "None", defaultValue="null") @RequestParam(value="password", required=false)  String password,@ApiParam(value = "None", defaultValue="null") @RequestParam(value="callback", required=false)  String paramCallback) {
        return CompletableFuture.completedFuture(new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED));

    }


    @ApiOperation(value = "To test enum parameters", nickname = "testEnumParameters", notes = "To test enum parameters", tags={ "fake", })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid request"),
        @ApiResponse(code = 404, message = "Not found") })
    @RequestMapping(value = "/fake",
        consumes = { "application/x-www-form-urlencoded" },
        method = RequestMethod.GET)
    default CompletableFuture<ResponseEntity<Void>> testEnumParameters(@ApiParam(value = "Header parameter enum test (string array)" , allowableValues=">, $") @RequestHeader(value="enum_header_string_array", required=false) List<String> enumHeaderStringArray,@ApiParam(value = "Header parameter enum test (string)" , allowableValues="_abc, -efg, (xyz)", defaultValue="-efg") @RequestHeader(value="enum_header_string", required=false) String enumHeaderString,@ApiParam(value = "Query parameter enum test (string array)", allowableValues = ">, $") @Valid @RequestParam(value = "enum_query_string_array", required = false) List<String> enumQueryStringArray,@ApiParam(value = "Query parameter enum test (string)", allowableValues = "_abc, -efg, (xyz)", defaultValue = "-efg") @Valid @RequestParam(value = "enum_query_string", required = false, defaultValue="-efg") String enumQueryString,@ApiParam(value = "Query parameter enum test (double)", allowableValues = "1, -2") @Valid @RequestParam(value = "enum_query_integer", required = false) Integer enumQueryInteger,@ApiParam(value = "Query parameter enum test (double)", allowableValues = "1.1, -1.2") @Valid @RequestParam(value = "enum_query_double", required = false) Double enumQueryDouble,@ApiParam(value = "Form parameter enum test (string array)", allowableValues=">, $", defaultValue="$") @RequestParam(value="enum_form_string_array", required=false)  List<String> enumFormStringArray,@ApiParam(value = "Form parameter enum test (string)", allowableValues="_abc, -efg, (xyz)", defaultValue="-efg") @RequestParam(value="enum_form_string", required=false)  String enumFormString) {
        return CompletableFuture.completedFuture(new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED));

    }


    @ApiOperation(value = "test inline additionalProperties", nickname = "testInlineAdditionalProperties", notes = "", tags={ "fake", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    @RequestMapping(value = "/fake/inline-additionalProperties",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default CompletableFuture<ResponseEntity<Void>> testInlineAdditionalProperties(@ApiParam(value = "request body" ,required=true )  @Valid @RequestBody Map<String, String> requestBody) {
        return CompletableFuture.completedFuture(new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED));

    }


    @ApiOperation(value = "test json serialization of form data", nickname = "testJsonFormData", notes = "", tags={ "fake", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    @RequestMapping(value = "/fake/jsonFormData",
        consumes = { "application/x-www-form-urlencoded" },
        method = RequestMethod.GET)
    default CompletableFuture<ResponseEntity<Void>> testJsonFormData(@ApiParam(value = "field1", required=true, defaultValue="null") @RequestParam(value="param", required=true)  String param,@ApiParam(value = "field2", required=true, defaultValue="null") @RequestParam(value="param2", required=true)  String param2) {
        return CompletableFuture.completedFuture(new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED));

    }

}
