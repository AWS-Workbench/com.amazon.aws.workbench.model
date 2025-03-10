/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Amazon Linux Image Builder ec2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.AmazonLinuxImageBuilder_ec2#getEdition_software_amazon_awscdk_services_ec2_AmazonLinuxEdition_ <em>Edition software amazon awscdk services ec2 Amazon Linux Edition </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.AmazonLinuxImageBuilder_ec2#getGeneration_software_amazon_awscdk_services_ec2_AmazonLinuxGeneration_ <em>Generation software amazon awscdk services ec2 Amazon Linux Generation </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.AmazonLinuxImageBuilder_ec2#getStorage_software_amazon_awscdk_services_ec2_AmazonLinuxStorage_ <em>Storage software amazon awscdk services ec2 Amazon Linux Storage </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.AmazonLinuxImageBuilder_ec2#getUserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference <em>User Data With User Data software amazon awscdk services ec2 User Data As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.AmazonLinuxImageBuilder_ec2#getVirtualization_software_amazon_awscdk_services_ec2_AmazonLinuxVirt_ <em>Virtualization software amazon awscdk services ec2 Amazon Linux Virt </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.AmazonLinuxImageBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.AmazonLinuxImageBuilder_ec2#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.AmazonLinuxImageBuilder_ec2#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.AmazonLinuxImageBuilder_ec2#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getAmazonLinuxImageBuilder_ec2()
 * @model
 * @generated
 */
public interface AmazonLinuxImageBuilder_ec2 extends ServiceResources {
	/**
	 * Returns the value of the '<em><b>Edition software amazon awscdk services ec2 Amazon Linux Edition </b></em>' attribute.
	 * The literals are from the enumeration {@link com.amazon.aws.workbench.model.awsworkbench.AmazonLinuxEdition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edition software amazon awscdk services ec2 Amazon Linux Edition </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AmazonLinuxEdition
	 * @see #setEdition_software_amazon_awscdk_services_ec2_AmazonLinuxEdition_(AmazonLinuxEdition)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getAmazonLinuxImageBuilder_ec2_Edition_software_amazon_awscdk_services_ec2_AmazonLinuxEdition_()
	 * @model dataType="com.amazon.aws.workbench.model.awsworkbench.AmazonLinuxEdition"
	 * @generated
	 */
	AmazonLinuxEdition getEdition_software_amazon_awscdk_services_ec2_AmazonLinuxEdition_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.AmazonLinuxImageBuilder_ec2#getEdition_software_amazon_awscdk_services_ec2_AmazonLinuxEdition_ <em>Edition software amazon awscdk services ec2 Amazon Linux Edition </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edition software amazon awscdk services ec2 Amazon Linux Edition </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AmazonLinuxEdition
	 * @see #getEdition_software_amazon_awscdk_services_ec2_AmazonLinuxEdition_()
	 * @generated
	 */
	void setEdition_software_amazon_awscdk_services_ec2_AmazonLinuxEdition_(AmazonLinuxEdition value);

	/**
	 * Returns the value of the '<em><b>Generation software amazon awscdk services ec2 Amazon Linux Generation </b></em>' attribute.
	 * The literals are from the enumeration {@link com.amazon.aws.workbench.model.awsworkbench.AmazonLinuxGeneration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generation software amazon awscdk services ec2 Amazon Linux Generation </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AmazonLinuxGeneration
	 * @see #setGeneration_software_amazon_awscdk_services_ec2_AmazonLinuxGeneration_(AmazonLinuxGeneration)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getAmazonLinuxImageBuilder_ec2_Generation_software_amazon_awscdk_services_ec2_AmazonLinuxGeneration_()
	 * @model dataType="com.amazon.aws.workbench.model.awsworkbench.AmazonLinuxGeneration"
	 * @generated
	 */
	AmazonLinuxGeneration getGeneration_software_amazon_awscdk_services_ec2_AmazonLinuxGeneration_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.AmazonLinuxImageBuilder_ec2#getGeneration_software_amazon_awscdk_services_ec2_AmazonLinuxGeneration_ <em>Generation software amazon awscdk services ec2 Amazon Linux Generation </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generation software amazon awscdk services ec2 Amazon Linux Generation </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AmazonLinuxGeneration
	 * @see #getGeneration_software_amazon_awscdk_services_ec2_AmazonLinuxGeneration_()
	 * @generated
	 */
	void setGeneration_software_amazon_awscdk_services_ec2_AmazonLinuxGeneration_(AmazonLinuxGeneration value);

	/**
	 * Returns the value of the '<em><b>Storage software amazon awscdk services ec2 Amazon Linux Storage </b></em>' attribute.
	 * The literals are from the enumeration {@link com.amazon.aws.workbench.model.awsworkbench.AmazonLinuxStorage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Storage software amazon awscdk services ec2 Amazon Linux Storage </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AmazonLinuxStorage
	 * @see #setStorage_software_amazon_awscdk_services_ec2_AmazonLinuxStorage_(AmazonLinuxStorage)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getAmazonLinuxImageBuilder_ec2_Storage_software_amazon_awscdk_services_ec2_AmazonLinuxStorage_()
	 * @model dataType="com.amazon.aws.workbench.model.awsworkbench.AmazonLinuxStorage"
	 * @generated
	 */
	AmazonLinuxStorage getStorage_software_amazon_awscdk_services_ec2_AmazonLinuxStorage_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.AmazonLinuxImageBuilder_ec2#getStorage_software_amazon_awscdk_services_ec2_AmazonLinuxStorage_ <em>Storage software amazon awscdk services ec2 Amazon Linux Storage </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storage software amazon awscdk services ec2 Amazon Linux Storage </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AmazonLinuxStorage
	 * @see #getStorage_software_amazon_awscdk_services_ec2_AmazonLinuxStorage_()
	 * @generated
	 */
	void setStorage_software_amazon_awscdk_services_ec2_AmazonLinuxStorage_(AmazonLinuxStorage value);

	/**
	 * Returns the value of the '<em><b>User Data With User Data software amazon awscdk services ec2 User Data As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Data With User Data software amazon awscdk services ec2 User Data As Reference</em>' attribute.
	 * @see #setUserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getAmazonLinuxImageBuilder_ec2_UserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference()
	 * @model
	 * @generated
	 */
	String getUserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.AmazonLinuxImageBuilder_ec2#getUserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference <em>User Data With User Data software amazon awscdk services ec2 User Data As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Data With User Data software amazon awscdk services ec2 User Data As Reference</em>' attribute.
	 * @see #getUserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference()
	 * @generated
	 */
	void setUserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Virtualization software amazon awscdk services ec2 Amazon Linux Virt </b></em>' attribute.
	 * The literals are from the enumeration {@link com.amazon.aws.workbench.model.awsworkbench.AmazonLinuxVirt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Virtualization software amazon awscdk services ec2 Amazon Linux Virt </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AmazonLinuxVirt
	 * @see #setVirtualization_software_amazon_awscdk_services_ec2_AmazonLinuxVirt_(AmazonLinuxVirt)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getAmazonLinuxImageBuilder_ec2_Virtualization_software_amazon_awscdk_services_ec2_AmazonLinuxVirt_()
	 * @model dataType="com.amazon.aws.workbench.model.awsworkbench.AmazonLinuxVirt"
	 * @generated
	 */
	AmazonLinuxVirt getVirtualization_software_amazon_awscdk_services_ec2_AmazonLinuxVirt_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.AmazonLinuxImageBuilder_ec2#getVirtualization_software_amazon_awscdk_services_ec2_AmazonLinuxVirt_ <em>Virtualization software amazon awscdk services ec2 Amazon Linux Virt </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Virtualization software amazon awscdk services ec2 Amazon Linux Virt </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AmazonLinuxVirt
	 * @see #getVirtualization_software_amazon_awscdk_services_ec2_AmazonLinuxVirt_()
	 * @generated
	 */
	void setVirtualization_software_amazon_awscdk_services_ec2_AmazonLinuxVirt_(AmazonLinuxVirt value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.ec2.AmazonLinuxImage"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getAmazonLinuxImageBuilder_ec2_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.ec2.AmazonLinuxImage" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getAmazonLinuxImageBuilder_ec2_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.AmazonLinuxImageBuilder_ec2#getVarName <em>Var Name</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getAmazonLinuxImageBuilder_ec2_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.AmazonLinuxImageBuilder_ec2#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getAmazonLinuxImageBuilder_ec2_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.AmazonLinuxImageBuilder_ec2#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // AmazonLinuxImageBuilder_ec2
