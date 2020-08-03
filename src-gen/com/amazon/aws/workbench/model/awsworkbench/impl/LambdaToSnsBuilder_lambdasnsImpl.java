/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.LambdaToSnsBuilder_lambdasns;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lambda To Sns Builder lambdasns</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.LambdaToSnsBuilder_lambdasnsImpl#getEnableEncryption_java_lang_Boolean_ <em>Enable Encryption java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.LambdaToSnsBuilder_lambdasnsImpl#getEncryptionKeyWithKey_software_amazon_awscdk_services_kms_Key_AsReference <em>Encryption Key With Key software amazon awscdk services kms Key As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.LambdaToSnsBuilder_lambdasnsImpl#getExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference <em>Existing Lambda Obj With Function software amazon awscdk services lambda Function As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.LambdaToSnsBuilder_lambdasnsImpl#getLambdaFunctionProps_java_lang_Object_ <em>Lambda Function Props java lang Object </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.LambdaToSnsBuilder_lambdasnsImpl#getTopicProps_java_lang_Object_ <em>Topic Props java lang Object </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.LambdaToSnsBuilder_lambdasnsImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.LambdaToSnsBuilder_lambdasnsImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.LambdaToSnsBuilder_lambdasnsImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.LambdaToSnsBuilder_lambdasnsImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LambdaToSnsBuilder_lambdasnsImpl extends MinimalEObjectImpl.Container
		implements LambdaToSnsBuilder_lambdasns {
	/**
	 * The default value of the '{@link #getEnableEncryption_java_lang_Boolean_() <em>Enable Encryption java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnableEncryption_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ENABLE_ENCRYPTION_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnableEncryption_java_lang_Boolean_() <em>Enable Encryption java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnableEncryption_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean enableEncryption_java_lang_Boolean_ = ENABLE_ENCRYPTION_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getEncryptionKeyWithKey_software_amazon_awscdk_services_kms_Key_AsReference() <em>Encryption Key With Key software amazon awscdk services kms Key As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncryptionKeyWithKey_software_amazon_awscdk_services_kms_Key_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String ENCRYPTION_KEY_WITH_KEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_KEY_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEncryptionKeyWithKey_software_amazon_awscdk_services_kms_Key_AsReference() <em>Encryption Key With Key software amazon awscdk services kms Key As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncryptionKeyWithKey_software_amazon_awscdk_services_kms_Key_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String encryptionKeyWithKey_software_amazon_awscdk_services_kms_Key_AsReference = ENCRYPTION_KEY_WITH_KEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_KEY_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference() <em>Existing Lambda Obj With Function software amazon awscdk services lambda Function As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String EXISTING_LAMBDA_OBJ_WITH_FUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference() <em>Existing Lambda Obj With Function software amazon awscdk services lambda Function As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String existingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference = EXISTING_LAMBDA_OBJ_WITH_FUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLambdaFunctionProps_java_lang_Object_() <em>Lambda Function Props java lang Object </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLambdaFunctionProps_java_lang_Object_()
	 * @generated
	 * @ordered
	 */
	protected static final Object LAMBDA_FUNCTION_PROPS_JAVA_LANG_OBJECT__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLambdaFunctionProps_java_lang_Object_() <em>Lambda Function Props java lang Object </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLambdaFunctionProps_java_lang_Object_()
	 * @generated
	 * @ordered
	 */
	protected Object lambdaFunctionProps_java_lang_Object_ = LAMBDA_FUNCTION_PROPS_JAVA_LANG_OBJECT__EDEFAULT;

	/**
	 * The default value of the '{@link #getTopicProps_java_lang_Object_() <em>Topic Props java lang Object </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopicProps_java_lang_Object_()
	 * @generated
	 * @ordered
	 */
	protected static final Object TOPIC_PROPS_JAVA_LANG_OBJECT__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTopicProps_java_lang_Object_() <em>Topic Props java lang Object </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopicProps_java_lang_Object_()
	 * @generated
	 * @ordered
	 */
	protected Object topicProps_java_lang_Object_ = TOPIC_PROPS_JAVA_LANG_OBJECT__EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.awsconstructs.services.lambdasns.LambdaToSns";

	/**
	 * The cached value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected String generatedClassName = GENERATED_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getVarName() <em>Var Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarName()
	 * @generated
	 * @ordered
	 */
	protected static final String VAR_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVarName() <em>Var Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarName()
	 * @generated
	 * @ordered
	 */
	protected String varName = VAR_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String identifier = IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdditionalCode() <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalCode()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDITIONAL_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdditionalCode() <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalCode()
	 * @generated
	 * @ordered
	 */
	protected String additionalCode = ADDITIONAL_CODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LambdaToSnsBuilder_lambdasnsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsworkbenchPackage.Literals.LAMBDA_TO_SNS_BUILDER_LAMBDASNS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getEnableEncryption_java_lang_Boolean_() {
		return enableEncryption_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnableEncryption_java_lang_Boolean_(Boolean newEnableEncryption_java_lang_Boolean_) {
		Boolean oldEnableEncryption_java_lang_Boolean_ = enableEncryption_java_lang_Boolean_;
		enableEncryption_java_lang_Boolean_ = newEnableEncryption_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.LAMBDA_TO_SNS_BUILDER_LAMBDASNS__ENABLE_ENCRYPTION_JAVA_LANG_BOOLEAN_,
					oldEnableEncryption_java_lang_Boolean_, enableEncryption_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEncryptionKeyWithKey_software_amazon_awscdk_services_kms_Key_AsReference() {
		return encryptionKeyWithKey_software_amazon_awscdk_services_kms_Key_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEncryptionKeyWithKey_software_amazon_awscdk_services_kms_Key_AsReference(
			String newEncryptionKeyWithKey_software_amazon_awscdk_services_kms_Key_AsReference) {
		String oldEncryptionKeyWithKey_software_amazon_awscdk_services_kms_Key_AsReference = encryptionKeyWithKey_software_amazon_awscdk_services_kms_Key_AsReference;
		encryptionKeyWithKey_software_amazon_awscdk_services_kms_Key_AsReference = newEncryptionKeyWithKey_software_amazon_awscdk_services_kms_Key_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.LAMBDA_TO_SNS_BUILDER_LAMBDASNS__ENCRYPTION_KEY_WITH_KEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_KEY_AS_REFERENCE,
					oldEncryptionKeyWithKey_software_amazon_awscdk_services_kms_Key_AsReference,
					encryptionKeyWithKey_software_amazon_awscdk_services_kms_Key_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference() {
		return existingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference(
			String newExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference) {
		String oldExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference = existingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference;
		existingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference = newExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.LAMBDA_TO_SNS_BUILDER_LAMBDASNS__EXISTING_LAMBDA_OBJ_WITH_FUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_AS_REFERENCE,
					oldExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference,
					existingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getLambdaFunctionProps_java_lang_Object_() {
		return lambdaFunctionProps_java_lang_Object_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLambdaFunctionProps_java_lang_Object_(Object newLambdaFunctionProps_java_lang_Object_) {
		Object oldLambdaFunctionProps_java_lang_Object_ = lambdaFunctionProps_java_lang_Object_;
		lambdaFunctionProps_java_lang_Object_ = newLambdaFunctionProps_java_lang_Object_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.LAMBDA_TO_SNS_BUILDER_LAMBDASNS__LAMBDA_FUNCTION_PROPS_JAVA_LANG_OBJECT_,
					oldLambdaFunctionProps_java_lang_Object_, lambdaFunctionProps_java_lang_Object_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getTopicProps_java_lang_Object_() {
		return topicProps_java_lang_Object_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTopicProps_java_lang_Object_(Object newTopicProps_java_lang_Object_) {
		Object oldTopicProps_java_lang_Object_ = topicProps_java_lang_Object_;
		topicProps_java_lang_Object_ = newTopicProps_java_lang_Object_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.LAMBDA_TO_SNS_BUILDER_LAMBDASNS__TOPIC_PROPS_JAVA_LANG_OBJECT_,
					oldTopicProps_java_lang_Object_, topicProps_java_lang_Object_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGeneratedClassName() {
		return generatedClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVarName() {
		return varName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVarName(String newVarName) {
		String oldVarName = varName;
		varName = newVarName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.LAMBDA_TO_SNS_BUILDER_LAMBDASNS__VAR_NAME, oldVarName, varName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdentifier(String newIdentifier) {
		String oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.LAMBDA_TO_SNS_BUILDER_LAMBDASNS__IDENTIFIER, oldIdentifier, identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAdditionalCode() {
		return additionalCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdditionalCode(String newAdditionalCode) {
		String oldAdditionalCode = additionalCode;
		additionalCode = newAdditionalCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.LAMBDA_TO_SNS_BUILDER_LAMBDASNS__ADDITIONAL_CODE, oldAdditionalCode,
					additionalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AwsworkbenchPackage.LAMBDA_TO_SNS_BUILDER_LAMBDASNS__ENABLE_ENCRYPTION_JAVA_LANG_BOOLEAN_:
			return getEnableEncryption_java_lang_Boolean_();
		case AwsworkbenchPackage.LAMBDA_TO_SNS_BUILDER_LAMBDASNS__ENCRYPTION_KEY_WITH_KEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_KEY_AS_REFERENCE:
			return getEncryptionKeyWithKey_software_amazon_awscdk_services_kms_Key_AsReference();
		case AwsworkbenchPackage.LAMBDA_TO_SNS_BUILDER_LAMBDASNS__EXISTING_LAMBDA_OBJ_WITH_FUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_AS_REFERENCE:
			return getExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference();
		case AwsworkbenchPackage.LAMBDA_TO_SNS_BUILDER_LAMBDASNS__LAMBDA_FUNCTION_PROPS_JAVA_LANG_OBJECT_:
			return getLambdaFunctionProps_java_lang_Object_();
		case AwsworkbenchPackage.LAMBDA_TO_SNS_BUILDER_LAMBDASNS__TOPIC_PROPS_JAVA_LANG_OBJECT_:
			return getTopicProps_java_lang_Object_();
		case AwsworkbenchPackage.LAMBDA_TO_SNS_BUILDER_LAMBDASNS__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case AwsworkbenchPackage.LAMBDA_TO_SNS_BUILDER_LAMBDASNS__VAR_NAME:
			return getVarName();
		case AwsworkbenchPackage.LAMBDA_TO_SNS_BUILDER_LAMBDASNS__IDENTIFIER:
			return getIdentifier();
		case AwsworkbenchPackage.LAMBDA_TO_SNS_BUILDER_LAMBDASNS__ADDITIONAL_CODE:
			return getAdditionalCode();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case AwsworkbenchPackage.LAMBDA_TO_SNS_BUILDER_LAMBDASNS__ENABLE_ENCRYPTION_JAVA_LANG_BOOLEAN_:
			setEnableEncryption_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.LAMBDA_TO_SNS_BUILDER_LAMBDASNS__ENCRYPTION_KEY_WITH_KEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_KEY_AS_REFERENCE:
			setEncryptionKeyWithKey_software_amazon_awscdk_services_kms_Key_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.LAMBDA_TO_SNS_BUILDER_LAMBDASNS__EXISTING_LAMBDA_OBJ_WITH_FUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_AS_REFERENCE:
			setExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference(
					(String) newValue);
			return;
		case AwsworkbenchPackage.LAMBDA_TO_SNS_BUILDER_LAMBDASNS__LAMBDA_FUNCTION_PROPS_JAVA_LANG_OBJECT_:
			setLambdaFunctionProps_java_lang_Object_(newValue);
			return;
		case AwsworkbenchPackage.LAMBDA_TO_SNS_BUILDER_LAMBDASNS__TOPIC_PROPS_JAVA_LANG_OBJECT_:
			setTopicProps_java_lang_Object_(newValue);
			return;
		case AwsworkbenchPackage.LAMBDA_TO_SNS_BUILDER_LAMBDASNS__VAR_NAME:
			setVarName((String) newValue);
			return;
		case AwsworkbenchPackage.LAMBDA_TO_SNS_BUILDER_LAMBDASNS__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case AwsworkbenchPackage.LAMBDA_TO_SNS_BUILDER_LAMBDASNS__ADDITIONAL_CODE:
			setAdditionalCode((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case AwsworkbenchPackage.LAMBDA_TO_SNS_BUILDER_LAMBDASNS__ENABLE_ENCRYPTION_JAVA_LANG_BOOLEAN_:
			setEnableEncryption_java_lang_Boolean_(ENABLE_ENCRYPTION_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.LAMBDA_TO_SNS_BUILDER_LAMBDASNS__ENCRYPTION_KEY_WITH_KEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_KEY_AS_REFERENCE:
			setEncryptionKeyWithKey_software_amazon_awscdk_services_kms_Key_AsReference(
					ENCRYPTION_KEY_WITH_KEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_KEY_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.LAMBDA_TO_SNS_BUILDER_LAMBDASNS__EXISTING_LAMBDA_OBJ_WITH_FUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_AS_REFERENCE:
			setExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference(
					EXISTING_LAMBDA_OBJ_WITH_FUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.LAMBDA_TO_SNS_BUILDER_LAMBDASNS__LAMBDA_FUNCTION_PROPS_JAVA_LANG_OBJECT_:
			setLambdaFunctionProps_java_lang_Object_(LAMBDA_FUNCTION_PROPS_JAVA_LANG_OBJECT__EDEFAULT);
			return;
		case AwsworkbenchPackage.LAMBDA_TO_SNS_BUILDER_LAMBDASNS__TOPIC_PROPS_JAVA_LANG_OBJECT_:
			setTopicProps_java_lang_Object_(TOPIC_PROPS_JAVA_LANG_OBJECT__EDEFAULT);
			return;
		case AwsworkbenchPackage.LAMBDA_TO_SNS_BUILDER_LAMBDASNS__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.LAMBDA_TO_SNS_BUILDER_LAMBDASNS__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case AwsworkbenchPackage.LAMBDA_TO_SNS_BUILDER_LAMBDASNS__ADDITIONAL_CODE:
			setAdditionalCode(ADDITIONAL_CODE_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case AwsworkbenchPackage.LAMBDA_TO_SNS_BUILDER_LAMBDASNS__ENABLE_ENCRYPTION_JAVA_LANG_BOOLEAN_:
			return ENABLE_ENCRYPTION_JAVA_LANG_BOOLEAN__EDEFAULT == null ? enableEncryption_java_lang_Boolean_ != null
					: !ENABLE_ENCRYPTION_JAVA_LANG_BOOLEAN__EDEFAULT.equals(enableEncryption_java_lang_Boolean_);
		case AwsworkbenchPackage.LAMBDA_TO_SNS_BUILDER_LAMBDASNS__ENCRYPTION_KEY_WITH_KEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_KEY_AS_REFERENCE:
			return ENCRYPTION_KEY_WITH_KEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_KEY_AS_REFERENCE_EDEFAULT == null
					? encryptionKeyWithKey_software_amazon_awscdk_services_kms_Key_AsReference != null
					: !ENCRYPTION_KEY_WITH_KEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_KEY_AS_REFERENCE_EDEFAULT
							.equals(encryptionKeyWithKey_software_amazon_awscdk_services_kms_Key_AsReference);
		case AwsworkbenchPackage.LAMBDA_TO_SNS_BUILDER_LAMBDASNS__EXISTING_LAMBDA_OBJ_WITH_FUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_AS_REFERENCE:
			return EXISTING_LAMBDA_OBJ_WITH_FUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_AS_REFERENCE_EDEFAULT == null
					? existingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference != null
					: !EXISTING_LAMBDA_OBJ_WITH_FUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_AS_REFERENCE_EDEFAULT
							.equals(existingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference);
		case AwsworkbenchPackage.LAMBDA_TO_SNS_BUILDER_LAMBDASNS__LAMBDA_FUNCTION_PROPS_JAVA_LANG_OBJECT_:
			return LAMBDA_FUNCTION_PROPS_JAVA_LANG_OBJECT__EDEFAULT == null
					? lambdaFunctionProps_java_lang_Object_ != null
					: !LAMBDA_FUNCTION_PROPS_JAVA_LANG_OBJECT__EDEFAULT.equals(lambdaFunctionProps_java_lang_Object_);
		case AwsworkbenchPackage.LAMBDA_TO_SNS_BUILDER_LAMBDASNS__TOPIC_PROPS_JAVA_LANG_OBJECT_:
			return TOPIC_PROPS_JAVA_LANG_OBJECT__EDEFAULT == null ? topicProps_java_lang_Object_ != null
					: !TOPIC_PROPS_JAVA_LANG_OBJECT__EDEFAULT.equals(topicProps_java_lang_Object_);
		case AwsworkbenchPackage.LAMBDA_TO_SNS_BUILDER_LAMBDASNS__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case AwsworkbenchPackage.LAMBDA_TO_SNS_BUILDER_LAMBDASNS__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case AwsworkbenchPackage.LAMBDA_TO_SNS_BUILDER_LAMBDASNS__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case AwsworkbenchPackage.LAMBDA_TO_SNS_BUILDER_LAMBDASNS__ADDITIONAL_CODE:
			return ADDITIONAL_CODE_EDEFAULT == null ? additionalCode != null
					: !ADDITIONAL_CODE_EDEFAULT.equals(additionalCode);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (enableEncryption_java_lang_Boolean_: ");
		result.append(enableEncryption_java_lang_Boolean_);
		result.append(", encryptionKeyWithKey_software_amazon_awscdk_services_kms_Key_AsReference: ");
		result.append(encryptionKeyWithKey_software_amazon_awscdk_services_kms_Key_AsReference);
		result.append(", existingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference: ");
		result.append(existingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference);
		result.append(", lambdaFunctionProps_java_lang_Object_: ");
		result.append(lambdaFunctionProps_java_lang_Object_);
		result.append(", topicProps_java_lang_Object_: ");
		result.append(topicProps_java_lang_Object_);
		result.append(", generatedClassName: ");
		result.append(generatedClassName);
		result.append(", varName: ");
		result.append(varName);
		result.append(", identifier: ");
		result.append(identifier);
		result.append(", additionalCode: ");
		result.append(additionalCode);
		result.append(')');
		return result.toString();
	}

} //LambdaToSnsBuilder_lambdasnsImpl
