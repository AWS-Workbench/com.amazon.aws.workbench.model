/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rolling Update Configuration Builder autoscaling</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.RollingUpdateConfigurationBuilder_autoscaling#getMaxBatchSize_java_lang_Number_ <em>Max Batch Size java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.RollingUpdateConfigurationBuilder_autoscaling#getMinInstancesInService_java_lang_Number_ <em>Min Instances In Service java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.RollingUpdateConfigurationBuilder_autoscaling#getMinSuccessfulInstancesPercent_java_lang_Number_ <em>Min Successful Instances Percent java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.RollingUpdateConfigurationBuilder_autoscaling#getPauseTimeWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Pause Time With Duration software amazon awscdk core Duration As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.RollingUpdateConfigurationBuilder_autoscaling#getSuspendProcesses_software_amazon_awscdk_services_autoscaling_ScalingProcess_AsList <em>Suspend Processes software amazon awscdk services autoscaling Scaling Process As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.RollingUpdateConfigurationBuilder_autoscaling#getWaitOnResourceSignals_java_lang_Boolean_ <em>Wait On Resource Signals java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.RollingUpdateConfigurationBuilder_autoscaling#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.RollingUpdateConfigurationBuilder_autoscaling#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.RollingUpdateConfigurationBuilder_autoscaling#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.RollingUpdateConfigurationBuilder_autoscaling#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getRollingUpdateConfigurationBuilder_autoscaling()
 * @model
 * @generated
 */
public interface RollingUpdateConfigurationBuilder_autoscaling extends ServiceResources {
	/**
	 * Returns the value of the '<em><b>Max Batch Size java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Batch Size java lang Number </em>' attribute.
	 * @see #setMaxBatchSize_java_lang_Number_(int)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getRollingUpdateConfigurationBuilder_autoscaling_MaxBatchSize_java_lang_Number_()
	 * @model
	 * @generated
	 */
	int getMaxBatchSize_java_lang_Number_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.RollingUpdateConfigurationBuilder_autoscaling#getMaxBatchSize_java_lang_Number_ <em>Max Batch Size java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Batch Size java lang Number </em>' attribute.
	 * @see #getMaxBatchSize_java_lang_Number_()
	 * @generated
	 */
	void setMaxBatchSize_java_lang_Number_(int value);

	/**
	 * Returns the value of the '<em><b>Min Instances In Service java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Instances In Service java lang Number </em>' attribute.
	 * @see #setMinInstancesInService_java_lang_Number_(int)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getRollingUpdateConfigurationBuilder_autoscaling_MinInstancesInService_java_lang_Number_()
	 * @model
	 * @generated
	 */
	int getMinInstancesInService_java_lang_Number_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.RollingUpdateConfigurationBuilder_autoscaling#getMinInstancesInService_java_lang_Number_ <em>Min Instances In Service java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Instances In Service java lang Number </em>' attribute.
	 * @see #getMinInstancesInService_java_lang_Number_()
	 * @generated
	 */
	void setMinInstancesInService_java_lang_Number_(int value);

	/**
	 * Returns the value of the '<em><b>Min Successful Instances Percent java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Successful Instances Percent java lang Number </em>' attribute.
	 * @see #setMinSuccessfulInstancesPercent_java_lang_Number_(int)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getRollingUpdateConfigurationBuilder_autoscaling_MinSuccessfulInstancesPercent_java_lang_Number_()
	 * @model
	 * @generated
	 */
	int getMinSuccessfulInstancesPercent_java_lang_Number_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.RollingUpdateConfigurationBuilder_autoscaling#getMinSuccessfulInstancesPercent_java_lang_Number_ <em>Min Successful Instances Percent java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Successful Instances Percent java lang Number </em>' attribute.
	 * @see #getMinSuccessfulInstancesPercent_java_lang_Number_()
	 * @generated
	 */
	void setMinSuccessfulInstancesPercent_java_lang_Number_(int value);

	/**
	 * Returns the value of the '<em><b>Pause Time With Duration software amazon awscdk core Duration As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pause Time With Duration software amazon awscdk core Duration As Reference</em>' attribute.
	 * @see #setPauseTimeWithDuration_software_amazon_awscdk_core_Duration_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getRollingUpdateConfigurationBuilder_autoscaling_PauseTimeWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @model
	 * @generated
	 */
	String getPauseTimeWithDuration_software_amazon_awscdk_core_Duration_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.RollingUpdateConfigurationBuilder_autoscaling#getPauseTimeWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Pause Time With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pause Time With Duration software amazon awscdk core Duration As Reference</em>' attribute.
	 * @see #getPauseTimeWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 */
	void setPauseTimeWithDuration_software_amazon_awscdk_core_Duration_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Suspend Processes software amazon awscdk services autoscaling Scaling Process As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suspend Processes software amazon awscdk services autoscaling Scaling Process As List</em>' attribute.
	 * @see #setSuspendProcesses_software_amazon_awscdk_services_autoscaling_ScalingProcess_AsList(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getRollingUpdateConfigurationBuilder_autoscaling_SuspendProcesses_software_amazon_awscdk_services_autoscaling_ScalingProcess_AsList()
	 * @model
	 * @generated
	 */
	String getSuspendProcesses_software_amazon_awscdk_services_autoscaling_ScalingProcess_AsList();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.RollingUpdateConfigurationBuilder_autoscaling#getSuspendProcesses_software_amazon_awscdk_services_autoscaling_ScalingProcess_AsList <em>Suspend Processes software amazon awscdk services autoscaling Scaling Process As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suspend Processes software amazon awscdk services autoscaling Scaling Process As List</em>' attribute.
	 * @see #getSuspendProcesses_software_amazon_awscdk_services_autoscaling_ScalingProcess_AsList()
	 * @generated
	 */
	void setSuspendProcesses_software_amazon_awscdk_services_autoscaling_ScalingProcess_AsList(String value);

	/**
	 * Returns the value of the '<em><b>Wait On Resource Signals java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wait On Resource Signals java lang Boolean </em>' attribute.
	 * @see #setWaitOnResourceSignals_java_lang_Boolean_(Boolean)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getRollingUpdateConfigurationBuilder_autoscaling_WaitOnResourceSignals_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getWaitOnResourceSignals_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.RollingUpdateConfigurationBuilder_autoscaling#getWaitOnResourceSignals_java_lang_Boolean_ <em>Wait On Resource Signals java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wait On Resource Signals java lang Boolean </em>' attribute.
	 * @see #getWaitOnResourceSignals_java_lang_Boolean_()
	 * @generated
	 */
	void setWaitOnResourceSignals_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.autoscaling.RollingUpdateConfiguration"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getRollingUpdateConfigurationBuilder_autoscaling_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.autoscaling.RollingUpdateConfiguration" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getRollingUpdateConfigurationBuilder_autoscaling_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.RollingUpdateConfigurationBuilder_autoscaling#getVarName <em>Var Name</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getRollingUpdateConfigurationBuilder_autoscaling_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.RollingUpdateConfigurationBuilder_autoscaling#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getRollingUpdateConfigurationBuilder_autoscaling_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.RollingUpdateConfigurationBuilder_autoscaling#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // RollingUpdateConfigurationBuilder_autoscaling
