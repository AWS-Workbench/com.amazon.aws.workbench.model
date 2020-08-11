/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lambda Function Association Builder cloudfront</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.LambdaFunctionAssociationBuilder_cloudfront#getEventType_software_amazon_awscdk_services_cloudfront_LambdaEdgeEventType_ <em>Event Type software amazon awscdk services cloudfront Lambda Edge Event Type </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.LambdaFunctionAssociationBuilder_cloudfront#getLambdaFunctionWithIVersion_software_amazon_awscdk_services_lambda_IVersion_AsReference <em>Lambda Function With IVersion software amazon awscdk services lambda IVersion As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.LambdaFunctionAssociationBuilder_cloudfront#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.LambdaFunctionAssociationBuilder_cloudfront#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.LambdaFunctionAssociationBuilder_cloudfront#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.LambdaFunctionAssociationBuilder_cloudfront#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getLambdaFunctionAssociationBuilder_cloudfront()
 * @model
 * @generated
 */
public interface LambdaFunctionAssociationBuilder_cloudfront extends EObject {
	/**
	 * Returns the value of the '<em><b>Event Type software amazon awscdk services cloudfront Lambda Edge Event Type </b></em>' attribute.
	 * The literals are from the enumeration {@link com.amazon.aws.workbench.model.awsworkbench.LambdaEdgeEventType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Type software amazon awscdk services cloudfront Lambda Edge Event Type </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.LambdaEdgeEventType
	 * @see #setEventType_software_amazon_awscdk_services_cloudfront_LambdaEdgeEventType_(LambdaEdgeEventType)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getLambdaFunctionAssociationBuilder_cloudfront_EventType_software_amazon_awscdk_services_cloudfront_LambdaEdgeEventType_()
	 * @model dataType="com.amazon.aws.workbench.model.awsworkbench.LambdaEdgeEventType"
	 * @generated
	 */
	LambdaEdgeEventType getEventType_software_amazon_awscdk_services_cloudfront_LambdaEdgeEventType_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.LambdaFunctionAssociationBuilder_cloudfront#getEventType_software_amazon_awscdk_services_cloudfront_LambdaEdgeEventType_ <em>Event Type software amazon awscdk services cloudfront Lambda Edge Event Type </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Type software amazon awscdk services cloudfront Lambda Edge Event Type </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.LambdaEdgeEventType
	 * @see #getEventType_software_amazon_awscdk_services_cloudfront_LambdaEdgeEventType_()
	 * @generated
	 */
	void setEventType_software_amazon_awscdk_services_cloudfront_LambdaEdgeEventType_(LambdaEdgeEventType value);

	/**
	 * Returns the value of the '<em><b>Lambda Function With IVersion software amazon awscdk services lambda IVersion As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lambda Function With IVersion software amazon awscdk services lambda IVersion As Reference</em>' attribute.
	 * @see #setLambdaFunctionWithIVersion_software_amazon_awscdk_services_lambda_IVersion_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getLambdaFunctionAssociationBuilder_cloudfront_LambdaFunctionWithIVersion_software_amazon_awscdk_services_lambda_IVersion_AsReference()
	 * @model
	 * @generated
	 */
	String getLambdaFunctionWithIVersion_software_amazon_awscdk_services_lambda_IVersion_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.LambdaFunctionAssociationBuilder_cloudfront#getLambdaFunctionWithIVersion_software_amazon_awscdk_services_lambda_IVersion_AsReference <em>Lambda Function With IVersion software amazon awscdk services lambda IVersion As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lambda Function With IVersion software amazon awscdk services lambda IVersion As Reference</em>' attribute.
	 * @see #getLambdaFunctionWithIVersion_software_amazon_awscdk_services_lambda_IVersion_AsReference()
	 * @generated
	 */
	void setLambdaFunctionWithIVersion_software_amazon_awscdk_services_lambda_IVersion_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.cloudfront.LambdaFunctionAssociation"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getLambdaFunctionAssociationBuilder_cloudfront_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.cloudfront.LambdaFunctionAssociation" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getLambdaFunctionAssociationBuilder_cloudfront_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.LambdaFunctionAssociationBuilder_cloudfront#getVarName <em>Var Name</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getLambdaFunctionAssociationBuilder_cloudfront_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.LambdaFunctionAssociationBuilder_cloudfront#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getLambdaFunctionAssociationBuilder_cloudfront_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.LambdaFunctionAssociationBuilder_cloudfront#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // LambdaFunctionAssociationBuilder_cloudfront
