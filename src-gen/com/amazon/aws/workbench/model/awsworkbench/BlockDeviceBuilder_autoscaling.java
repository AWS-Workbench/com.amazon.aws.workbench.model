/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block Device Builder autoscaling</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.BlockDeviceBuilder_autoscaling#getDeviceName_java_lang_String_ <em>Device Name java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.BlockDeviceBuilder_autoscaling#getVolumeWithBlockDeviceVolume_software_amazon_awscdk_services_autoscaling_BlockDeviceVolume_AsReference <em>Volume With Block Device Volume software amazon awscdk services autoscaling Block Device Volume As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.BlockDeviceBuilder_autoscaling#getMappingEnabled_java_lang_Boolean_ <em>Mapping Enabled java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.BlockDeviceBuilder_autoscaling#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.BlockDeviceBuilder_autoscaling#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.BlockDeviceBuilder_autoscaling#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.BlockDeviceBuilder_autoscaling#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getBlockDeviceBuilder_autoscaling()
 * @model
 * @generated
 */
public interface BlockDeviceBuilder_autoscaling extends ServiceResources {
	/**
	 * Returns the value of the '<em><b>Device Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Name java lang String </em>' attribute.
	 * @see #setDeviceName_java_lang_String_(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getBlockDeviceBuilder_autoscaling_DeviceName_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getDeviceName_java_lang_String_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.BlockDeviceBuilder_autoscaling#getDeviceName_java_lang_String_ <em>Device Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Name java lang String </em>' attribute.
	 * @see #getDeviceName_java_lang_String_()
	 * @generated
	 */
	void setDeviceName_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Volume With Block Device Volume software amazon awscdk services autoscaling Block Device Volume As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volume With Block Device Volume software amazon awscdk services autoscaling Block Device Volume As Reference</em>' attribute.
	 * @see #setVolumeWithBlockDeviceVolume_software_amazon_awscdk_services_autoscaling_BlockDeviceVolume_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getBlockDeviceBuilder_autoscaling_VolumeWithBlockDeviceVolume_software_amazon_awscdk_services_autoscaling_BlockDeviceVolume_AsReference()
	 * @model
	 * @generated
	 */
	String getVolumeWithBlockDeviceVolume_software_amazon_awscdk_services_autoscaling_BlockDeviceVolume_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.BlockDeviceBuilder_autoscaling#getVolumeWithBlockDeviceVolume_software_amazon_awscdk_services_autoscaling_BlockDeviceVolume_AsReference <em>Volume With Block Device Volume software amazon awscdk services autoscaling Block Device Volume As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volume With Block Device Volume software amazon awscdk services autoscaling Block Device Volume As Reference</em>' attribute.
	 * @see #getVolumeWithBlockDeviceVolume_software_amazon_awscdk_services_autoscaling_BlockDeviceVolume_AsReference()
	 * @generated
	 */
	void setVolumeWithBlockDeviceVolume_software_amazon_awscdk_services_autoscaling_BlockDeviceVolume_AsReference(
			String value);

	/**
	 * Returns the value of the '<em><b>Mapping Enabled java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping Enabled java lang Boolean </em>' attribute.
	 * @see #setMappingEnabled_java_lang_Boolean_(Boolean)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getBlockDeviceBuilder_autoscaling_MappingEnabled_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getMappingEnabled_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.BlockDeviceBuilder_autoscaling#getMappingEnabled_java_lang_Boolean_ <em>Mapping Enabled java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping Enabled java lang Boolean </em>' attribute.
	 * @see #getMappingEnabled_java_lang_Boolean_()
	 * @generated
	 */
	void setMappingEnabled_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.autoscaling.BlockDevice"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getBlockDeviceBuilder_autoscaling_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.autoscaling.BlockDevice" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getBlockDeviceBuilder_autoscaling_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.BlockDeviceBuilder_autoscaling#getVarName <em>Var Name</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getBlockDeviceBuilder_autoscaling_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.BlockDeviceBuilder_autoscaling#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getBlockDeviceBuilder_autoscaling_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.BlockDeviceBuilder_autoscaling#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // BlockDeviceBuilder_autoscaling
