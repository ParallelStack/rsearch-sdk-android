# RsearchApi

All URIs are relative to *https://api.parallelstack.com/api/rsearch/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addDocument**](RsearchApi.md#addDocument) | **POST** /indexes/{index_name}/document_types/{doc_type_name}/documents/{doc_id} | 
[**addDocumentType**](RsearchApi.md#addDocumentType) | **POST** /indexes/{index_name}/document_types/{doc_type_name} | 
[**addIndex**](RsearchApi.md#addIndex) | **POST** /indexes/{index_name} | 
[**deleteDocument**](RsearchApi.md#deleteDocument) | **DELETE** /indexes/{index_name}/document_types/{doc_type_name}/documents/{doc_id} | 
[**deleteIndex**](RsearchApi.md#deleteIndex) | **DELETE** /indexes/{index_name} | 
[**getAdvancedDocTypeSuggestResults**](RsearchApi.md#getAdvancedDocTypeSuggestResults) | **POST** /indexes/{index_name}/document_types/{doc_type_name}/suggest | 
[**getAdvancedIndexSuggestResults**](RsearchApi.md#getAdvancedIndexSuggestResults) | **POST** /indexes/{index_name}/suggest | 
[**getAdvancedSearchResults**](RsearchApi.md#getAdvancedSearchResults) | **POST** /indexes/{index_name}/document_types/{doc_type_name}/search | 
[**getAllDocumentTypes**](RsearchApi.md#getAllDocumentTypes) | **GET** /indexes/{index_name}/document_types | 
[**getAllDocuments**](RsearchApi.md#getAllDocuments) | **GET** /indexes/{index_name}/document_types/{doc_type_name}/documents | 
[**getAllIndexes**](RsearchApi.md#getAllIndexes) | **GET** /indexes | 
[**getBasicSearchResults**](RsearchApi.md#getBasicSearchResults) | **GET** /indexes/{index_name}/search | 
[**getDocTypeSuggestResults**](RsearchApi.md#getDocTypeSuggestResults) | **GET** /indexes/{index_name}/document_types/{doc_type_name}/suggest | 
[**getDocument**](RsearchApi.md#getDocument) | **GET** /indexes/{index_name}/document_types/{doc_type_name}/documents/{doc_id} | 
[**getDocumentType**](RsearchApi.md#getDocumentType) | **GET** /indexes/{index_name}/document_types/{doc_type_name} | 
[**getIndex**](RsearchApi.md#getIndex) | **GET** /indexes/{index_name} | 


<a name="addDocument"></a>
# **addDocument**
> CreateDocumentSuccess addDocument(indexName, docTypeName, docId, documentDetails)



Creates &#x60;doc_id&#x60; in &#x60;doc_type_name&#x60; for &#x60;index_name&#x60;

### Example
```java
// Import classes:
//import com.parallelstack.rsearch.RsearchApi;

RsearchApi apiInstance = new RsearchApi();
String indexName = "indexName_example"; // String | Name of the index
String docTypeName = "docTypeName_example"; // String | Name of the document_type
String docId = "docId_example"; // String | Document ID
Document documentDetails = new Document(); // Document | Details of the document
try {
    CreateDocumentSuccess result = apiInstance.addDocument(indexName, docTypeName, docId, documentDetails);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RsearchApi#addDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **indexName** | **String**| Name of the index |
 **docTypeName** | **String**| Name of the document_type |
 **docId** | **String**| Document ID |
 **documentDetails** | [**Document**](Document.md)| Details of the document |

### Return type

[**CreateDocumentSuccess**](CreateDocumentSuccess.md)

### Authorization

[authToken](../README.md#authToken), [writeAppID](../README.md#writeAppID)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addDocumentType"></a>
# **addDocumentType**
> CreateDocTypeSuccess addDocumentType(indexName, docTypeName, docTypeDetails)



Creates specific &#x60;document_type&#x60; in &#x60;index_name&#x60; with specified parameters. You should define the parameters correctly as per the getting started guide, else getting the right structure might be an issue.

### Example
```java
// Import classes:
//import com.parallelstack.rsearch.RsearchApi;

RsearchApi apiInstance = new RsearchApi();
String indexName = "indexName_example"; // String | Name of the index
String docTypeName = "docTypeName_example"; // String | Name of the document_type
DocumentType docTypeDetails = new DocumentType(); // DocumentType | Details of the document_type
try {
    CreateDocTypeSuccess result = apiInstance.addDocumentType(indexName, docTypeName, docTypeDetails);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RsearchApi#addDocumentType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **indexName** | **String**| Name of the index |
 **docTypeName** | **String**| Name of the document_type |
 **docTypeDetails** | [**DocumentType**](DocumentType.md)| Details of the document_type |

### Return type

[**CreateDocTypeSuccess**](CreateDocTypeSuccess.md)

### Authorization

[authToken](../README.md#authToken), [readAppID](../README.md#readAppID)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addIndex"></a>
# **addIndex**
> CreateIndexSuccess addIndex(indexName)



Creates &#x60;a new index&#x60;.

### Example
```java
// Import classes:
//import com.parallelstack.rsearch.RsearchApi;

RsearchApi apiInstance = new RsearchApi();
String indexName = "indexName_example"; // String | Name of the index
try {
    CreateIndexSuccess result = apiInstance.addIndex(indexName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RsearchApi#addIndex");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **indexName** | **String**| Name of the index |

### Return type

[**CreateIndexSuccess**](CreateIndexSuccess.md)

### Authorization

[authToken](../README.md#authToken), [writeAppID](../README.md#writeAppID)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteDocument"></a>
# **deleteDocument**
> DeleteDocumentSuccess deleteDocument(indexName, docTypeName, docId)



Deletes &#x60;doc_id&#x60; in &#x60;doc_type_name&#x60; for &#x60;index_name&#x60;

### Example
```java
// Import classes:
//import com.parallelstack.rsearch.RsearchApi;

RsearchApi apiInstance = new RsearchApi();
String indexName = "indexName_example"; // String | Name of the index
String docTypeName = "docTypeName_example"; // String | Name of the document_type
String docId = "docId_example"; // String | Document ID
try {
    DeleteDocumentSuccess result = apiInstance.deleteDocument(indexName, docTypeName, docId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RsearchApi#deleteDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **indexName** | **String**| Name of the index |
 **docTypeName** | **String**| Name of the document_type |
 **docId** | **String**| Document ID |

### Return type

[**DeleteDocumentSuccess**](DeleteDocumentSuccess.md)

### Authorization

[authToken](../README.md#authToken), [writeAppID](../README.md#writeAppID)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteIndex"></a>
# **deleteIndex**
> DeleteIndexSuccess deleteIndex(indexName)



Deletes &#x60;an index&#x60; {index_name}

### Example
```java
// Import classes:
//import com.parallelstack.rsearch.RsearchApi;

RsearchApi apiInstance = new RsearchApi();
String indexName = "indexName_example"; // String | Name of the index
try {
    DeleteIndexSuccess result = apiInstance.deleteIndex(indexName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RsearchApi#deleteIndex");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **indexName** | **String**| Name of the index |

### Return type

[**DeleteIndexSuccess**](DeleteIndexSuccess.md)

### Authorization

[authToken](../README.md#authToken), [writeAppID](../README.md#writeAppID)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAdvancedDocTypeSuggestResults"></a>
# **getAdvancedDocTypeSuggestResults**
> SuggestSuccess getAdvancedDocTypeSuggestResults(indexName, docTypeName, suggest)



Gets Suggestions from &#x60;doc_type_name&#x60; in &#x60;index_name&#x60; limited by the body params. Please ensure you refer the getting started guides, to get the format of the query right.

### Example
```java
// Import classes:
//import com.parallelstack.rsearch.RsearchApi;

RsearchApi apiInstance = new RsearchApi();
String indexName = "indexName_example"; // String | Name of the index
String docTypeName = "docTypeName_example"; // String | Name of the Document_type
SuggestQuery suggest = new SuggestQuery(); // SuggestQuery | Details of the search query
try {
    SuggestSuccess result = apiInstance.getAdvancedDocTypeSuggestResults(indexName, docTypeName, suggest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RsearchApi#getAdvancedDocTypeSuggestResults");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **indexName** | **String**| Name of the index |
 **docTypeName** | **String**| Name of the Document_type |
 **suggest** | [**SuggestQuery**](SuggestQuery.md)| Details of the search query |

### Return type

[**SuggestSuccess**](SuggestSuccess.md)

### Authorization

[authToken](../README.md#authToken), [readAppID](../README.md#readAppID)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAdvancedIndexSuggestResults"></a>
# **getAdvancedIndexSuggestResults**
> SuggestSuccess getAdvancedIndexSuggestResults(indexName, search)



Gets Suggestions in &#x60;index_name&#x60; limited by the request body fields

### Example
```java
// Import classes:
//import com.parallelstack.rsearch.RsearchApi;

RsearchApi apiInstance = new RsearchApi();
String indexName = "indexName_example"; // String | Name of the index
SuggestQuery search = new SuggestQuery(); // SuggestQuery | Details of the search query
try {
    SuggestSuccess result = apiInstance.getAdvancedIndexSuggestResults(indexName, search);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RsearchApi#getAdvancedIndexSuggestResults");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **indexName** | **String**| Name of the index |
 **search** | [**SuggestQuery**](SuggestQuery.md)| Details of the search query |

### Return type

[**SuggestSuccess**](SuggestSuccess.md)

### Authorization

[authToken](../README.md#authToken), [readAppID](../README.md#readAppID)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAdvancedSearchResults"></a>
# **getAdvancedSearchResults**
> SearchSuccess getAdvancedSearchResults(indexName, docTypeName, search)



Advanced Search which gets all documents in &#x60;index_name&#x60; for provided search criteria. Please ensure you refer the getting started guides, to get the format of the query right.

### Example
```java
// Import classes:
//import com.parallelstack.rsearch.RsearchApi;

RsearchApi apiInstance = new RsearchApi();
String indexName = "indexName_example"; // String | Name of the index
String docTypeName = "docTypeName_example"; // String | Name of the Document_type
SearchQuery search = new SearchQuery(); // SearchQuery | Details of the search query
try {
    SearchSuccess result = apiInstance.getAdvancedSearchResults(indexName, docTypeName, search);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RsearchApi#getAdvancedSearchResults");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **indexName** | **String**| Name of the index |
 **docTypeName** | **String**| Name of the Document_type |
 **search** | [**SearchQuery**](SearchQuery.md)| Details of the search query |

### Return type

[**SearchSuccess**](SearchSuccess.md)

### Authorization

[authToken](../README.md#authToken), [writeAppID](../README.md#writeAppID)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAllDocumentTypes"></a>
# **getAllDocumentTypes**
> GetDocTypesSuccess getAllDocumentTypes(indexName)



Gets &#x60;All document_types&#x60; present in &#x60;index_name&#x60;

### Example
```java
// Import classes:
//import com.parallelstack.rsearch.RsearchApi;

RsearchApi apiInstance = new RsearchApi();
String indexName = "indexName_example"; // String | Name of the index
try {
    GetDocTypesSuccess result = apiInstance.getAllDocumentTypes(indexName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RsearchApi#getAllDocumentTypes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **indexName** | **String**| Name of the index |

### Return type

[**GetDocTypesSuccess**](GetDocTypesSuccess.md)

### Authorization

[authToken](../README.md#authToken), [readAppID](../README.md#readAppID)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAllDocuments"></a>
# **getAllDocuments**
> GetDocumentsSuccess getAllDocuments(indexName, docTypeName)



Fetches all documents in &#x60;doc_type_name&#x60; for &#x60;index_name&#x60;. All the documents and hence careful with its use.

### Example
```java
// Import classes:
//import com.parallelstack.rsearch.RsearchApi;

RsearchApi apiInstance = new RsearchApi();
String indexName = "indexName_example"; // String | Name of the index
String docTypeName = "docTypeName_example"; // String | Name of the document_type
try {
    GetDocumentsSuccess result = apiInstance.getAllDocuments(indexName, docTypeName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RsearchApi#getAllDocuments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **indexName** | **String**| Name of the index |
 **docTypeName** | **String**| Name of the document_type |

### Return type

[**GetDocumentsSuccess**](GetDocumentsSuccess.md)

### Authorization

[authToken](../README.md#authToken), [readAppID](../README.md#readAppID)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAllIndexes"></a>
# **getAllIndexes**
> GetIndexesSuccess getAllIndexes()



Fetches &#x60;All indexes&#x60; that the user has. Not recommended to be used in production code, as there isn&#39;t that big a Use case for listing all indexes!

### Example
```java
// Import classes:
//import com.parallelstack.rsearch.RsearchApi;

RsearchApi apiInstance = new RsearchApi();
try {
    GetIndexesSuccess result = apiInstance.getAllIndexes();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RsearchApi#getAllIndexes");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetIndexesSuccess**](GetIndexesSuccess.md)

### Authorization

[authToken](../README.md#authToken), [readAppID](../README.md#readAppID)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBasicSearchResults"></a>
# **getBasicSearchResults**
> SearchSuccess getBasicSearchResults(indexName, q)



Basic Search which gets all documents in &#x60;index_name&#x60; for provided search criteria

### Example
```java
// Import classes:
//import com.parallelstack.rsearch.RsearchApi;

RsearchApi apiInstance = new RsearchApi();
String indexName = "indexName_example"; // String | Name of the index
String q = "q_example"; // String | Search Query
try {
    SearchSuccess result = apiInstance.getBasicSearchResults(indexName, q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RsearchApi#getBasicSearchResults");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **indexName** | **String**| Name of the index |
 **q** | **String**| Search Query |

### Return type

[**SearchSuccess**](SearchSuccess.md)

### Authorization

[authToken](../README.md#authToken), [readAppID](../README.md#readAppID)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDocTypeSuggestResults"></a>
# **getDocTypeSuggestResults**
> SuggestSuccess getDocTypeSuggestResults(indexName, docTypeName, q)



Gets Suggestions from &#x60;doc_type_name&#x60; in &#x60;index_name&#x60;. Please ensure you refer the getting started guides, to get the format of the query right.

### Example
```java
// Import classes:
//import com.parallelstack.rsearch.RsearchApi;

RsearchApi apiInstance = new RsearchApi();
String indexName = "indexName_example"; // String | Name of the index
String docTypeName = "docTypeName_example"; // String | Name of the Document_type
String q = "q_example"; // String | Details of the suggest query
try {
    SuggestSuccess result = apiInstance.getDocTypeSuggestResults(indexName, docTypeName, q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RsearchApi#getDocTypeSuggestResults");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **indexName** | **String**| Name of the index |
 **docTypeName** | **String**| Name of the Document_type |
 **q** | **String**| Details of the suggest query |

### Return type

[**SuggestSuccess**](SuggestSuccess.md)

### Authorization

[authToken](../README.md#authToken), [readAppID](../README.md#readAppID)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDocument"></a>
# **getDocument**
> GetDocumentSuccess getDocument(indexName, docTypeName, docId)



Fetches the document referenced by &#x60;doc_id&#x60; in &#x60;doc_type_name&#x60; for &#x60;index_name&#x60;

### Example
```java
// Import classes:
//import com.parallelstack.rsearch.RsearchApi;

RsearchApi apiInstance = new RsearchApi();
String indexName = "indexName_example"; // String | Name of the index
String docTypeName = "docTypeName_example"; // String | Name of the document_type
String docId = "docId_example"; // String | Document ID
try {
    GetDocumentSuccess result = apiInstance.getDocument(indexName, docTypeName, docId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RsearchApi#getDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **indexName** | **String**| Name of the index |
 **docTypeName** | **String**| Name of the document_type |
 **docId** | **String**| Document ID |

### Return type

[**GetDocumentSuccess**](GetDocumentSuccess.md)

### Authorization

[authToken](../README.md#authToken), [readAppID](../README.md#readAppID)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDocumentType"></a>
# **getDocumentType**
> GetDocTypeSuccess getDocumentType(indexName, docTypeName)



Checks whether &#x60;document_type&#x60; in &#x60;index_name&#x60; exists

### Example
```java
// Import classes:
//import com.parallelstack.rsearch.RsearchApi;

RsearchApi apiInstance = new RsearchApi();
String indexName = "indexName_example"; // String | Name of the index
String docTypeName = "docTypeName_example"; // String | Name of the document_type
try {
    GetDocTypeSuccess result = apiInstance.getDocumentType(indexName, docTypeName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RsearchApi#getDocumentType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **indexName** | **String**| Name of the index |
 **docTypeName** | **String**| Name of the document_type |

### Return type

[**GetDocTypeSuccess**](GetDocTypeSuccess.md)

### Authorization

[authToken](../README.md#authToken), [readAppID](../README.md#readAppID)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getIndex"></a>
# **getIndex**
> GetIndexSuccess getIndex(indexName)



Checks whether &#x60;a particular index&#x60; {index_name} exists

### Example
```java
// Import classes:
//import com.parallelstack.rsearch.RsearchApi;

RsearchApi apiInstance = new RsearchApi();
String indexName = "indexName_example"; // String | Name of the index
try {
    GetIndexSuccess result = apiInstance.getIndex(indexName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RsearchApi#getIndex");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **indexName** | **String**| Name of the index |

### Return type

[**GetIndexSuccess**](GetIndexSuccess.md)

### Authorization

[authToken](../README.md#authToken), [readAppID](../README.md#readAppID)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

