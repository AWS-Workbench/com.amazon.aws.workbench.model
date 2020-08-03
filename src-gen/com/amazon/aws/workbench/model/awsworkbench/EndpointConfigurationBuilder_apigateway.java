/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Endpoint Configuration Builder apigateway</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.EndpointConfigurationBuilder_apigateway#getTypes_software_amazon_awscdk_services_apigateway_EndpointType_AsList <em>Types software amazon awscdk services apigateway Endpoint Type As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.EndpointConfigurationBuilder_apigateway#getVpcEndpoints_software_amazon_awscdk_services_ec2_IVpcEndpoint_AsList <em>Vpc Endpoints software amazon awscdk services ec2 IVpc Endpoint As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.EndpointConfigurationBuilder_apigateway#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.EndpointConfigurationBuilder_apigateway#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.EndpointConfigurationBuilder_apigateway#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.EndpointConfigurationBuilder_apigateway#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getEndpointConfigurationBuilder_apigateway()
 * @model
 * @generated
 */
public interface EndpointConfigurationBuilder_apigateway extends EObject {
	/**
	 * Returns the value of the '<em><b>Types software amazon awscdk services apigateway Endpoint Type As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types software amazon awscdk services apigateway Endpoint Type As List</em>' attribute.
	 * @see #setTypes_software_amazon_awscdk_services_apigateway_EndpointType_AsList(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getEndpointConfigurationBuilder_apigateway_Types_software_amazon_awscdk_services_apigateway_EndpointType_AsList()
	 * @model
	 * @generated
	 */
	String getTypes_software_amazon_awscdk_services_apigateway_EndpointType_AsList();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.EndpointConfigurationBuilder_apigateway#getTypes_software_amazon_awscdk_services_apigateway_EndpointType_AsList <em>Types software amazon awscdk services apigateway Endpoint Type As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Types software amazon awscdk services apigateway Endpoint Type As List</em>' attribute.
	 * @see #getTypes_software_amazon_awscdk_services_apigateway_EndpointType_AsList()
	 * @generated
	 */
	void setTypes_software_amazon_awscdk_services_apigateway_EndpointType_AsList(String value);

	/**
	 * Returns the value of the '<em><b>Vpc Endpoints software amazon awscdk services ec2 IVpc Endpoint As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vpc Endpoints software amazon awscdk services ec2 IVpc Endpoint As List</em>' attribute.
	 * @see #setVpcEndpoints_software_amazon_awscdk_services_ec2_IVpcEndpoint_AsList(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getEndpointConfigurationBuilder_apigateway_VpcEndpoints_software_amazon_awscdk_services_ec2_IVpcEndpoint_AsList()
	 * @model
	 * @generated
	 */
	String getVpcEndpoints_software_amazon_awscdk_services_ec2_IVpcEndpoint_AsList();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.EndpointConfigurationBuilder_apigateway#getVpcEndpoints_software_amazon_awscdk_services_ec2_IVpcEndpoint_AsList <em>Vpc Endpoints software amazon awscdk services ec2 IVpc Endpoint As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vpc Endpoints software amazon awscdk services ec2 IVpc Endpoint As List</em>' attribute.
	 * @see #getVpcEndpoints_software_amazon_awscdk_services_ec2_IVpcEndpoint_AsList()
	 * @generated
	 */
	void setVpcEndpoints_software_amazon_awscdk_services_ec2_IVpcEndpoint_AsList(String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.apigateway.EndpointConfiguration"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getEndpointConfigurationBuilder_apigateway_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.apigateway.EndpointConfiguration" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getEndpointConfigurationBuilder_apigateway_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.EndpointConfigurationBuilder_apigateway#getVarName <em>Var Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var Name</em>' attribute.
	 * @see #getVarName()
	 * @generated
	 */
	void setVarName(String value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getEndpointConfigurationBuilder_apigateway_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.EndpointConfigurationBuilder_apigateway#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Code</em>' attribute.
	 * @see #setAdditionalCode(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getEndpointConfigurationBuilder_apigateway_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.EndpointConfigurationBuilder_apigateway#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // EndpointConfigurationBuilder_apigateway
