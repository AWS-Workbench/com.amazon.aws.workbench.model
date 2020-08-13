/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.LayerVersionBuilder_lambda;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Layer Version Builder lambda</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.LayerVersionBuilder_lambdaImpl#getCodeWithCode_software_amazon_awscdk_services_lambda_Code_AsReference <em>Code With Code software amazon awscdk services lambda Code As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.LayerVersionBuilder_lambdaImpl#getCompatibleRuntimes_software_amazon_awscdk_services_lambda_Runtime_AsList <em>Compatible Runtimes software amazon awscdk services lambda Runtime As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.LayerVersionBuilder_lambdaImpl#getDescription_java_lang_String_ <em>Description java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.LayerVersionBuilder_lambdaImpl#getLayerVersionName_java_lang_String_ <em>Layer Version Name java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.LayerVersionBuilder_lambdaImpl#getLicense_java_lang_String_ <em>License java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.LayerVersionBuilder_lambdaImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.LayerVersionBuilder_lambdaImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.LayerVersionBuilder_lambdaImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.LayerVersionBuilder_lambdaImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LayerVersionBuilder_lambdaImpl extends ServiceResourcesImpl implements LayerVersionBuilder_lambda {
	/**
	 * The default value of the '{@link #getCodeWithCode_software_amazon_awscdk_services_lambda_Code_AsReference() <em>Code With Code software amazon awscdk services lambda Code As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeWithCode_software_amazon_awscdk_services_lambda_Code_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_WITH_CODE_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_CODE_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodeWithCode_software_amazon_awscdk_services_lambda_Code_AsReference() <em>Code With Code software amazon awscdk services lambda Code As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeWithCode_software_amazon_awscdk_services_lambda_Code_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String codeWithCode_software_amazon_awscdk_services_lambda_Code_AsReference = CODE_WITH_CODE_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_CODE_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompatibleRuntimes_software_amazon_awscdk_services_lambda_Runtime_AsList() <em>Compatible Runtimes software amazon awscdk services lambda Runtime As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompatibleRuntimes_software_amazon_awscdk_services_lambda_Runtime_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPATIBLE_RUNTIMES_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_RUNTIME_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompatibleRuntimes_software_amazon_awscdk_services_lambda_Runtime_AsList() <em>Compatible Runtimes software amazon awscdk services lambda Runtime As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompatibleRuntimes_software_amazon_awscdk_services_lambda_Runtime_AsList()
	 * @generated
	 * @ordered
	 */
	protected String compatibleRuntimes_software_amazon_awscdk_services_lambda_Runtime_AsList = COMPATIBLE_RUNTIMES_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_RUNTIME_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription_java_lang_String_() <em>Description java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription_java_lang_String_() <em>Description java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String description_java_lang_String_ = DESCRIPTION_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getLayerVersionName_java_lang_String_() <em>Layer Version Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayerVersionName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String LAYER_VERSION_NAME_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLayerVersionName_java_lang_String_() <em>Layer Version Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayerVersionName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String layerVersionName_java_lang_String_ = LAYER_VERSION_NAME_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getLicense_java_lang_String_() <em>License java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicense_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String LICENSE_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLicense_java_lang_String_() <em>License java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicense_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String license_java_lang_String_ = LICENSE_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.lambda.LayerVersion";

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
	protected LayerVersionBuilder_lambdaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsworkbenchPackage.Literals.LAYER_VERSION_BUILDER_LAMBDA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCodeWithCode_software_amazon_awscdk_services_lambda_Code_AsReference() {
		return codeWithCode_software_amazon_awscdk_services_lambda_Code_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCodeWithCode_software_amazon_awscdk_services_lambda_Code_AsReference(
			String newCodeWithCode_software_amazon_awscdk_services_lambda_Code_AsReference) {
		String oldCodeWithCode_software_amazon_awscdk_services_lambda_Code_AsReference = codeWithCode_software_amazon_awscdk_services_lambda_Code_AsReference;
		codeWithCode_software_amazon_awscdk_services_lambda_Code_AsReference = newCodeWithCode_software_amazon_awscdk_services_lambda_Code_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.LAYER_VERSION_BUILDER_LAMBDA__CODE_WITH_CODE_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_CODE_AS_REFERENCE,
					oldCodeWithCode_software_amazon_awscdk_services_lambda_Code_AsReference,
					codeWithCode_software_amazon_awscdk_services_lambda_Code_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCompatibleRuntimes_software_amazon_awscdk_services_lambda_Runtime_AsList() {
		return compatibleRuntimes_software_amazon_awscdk_services_lambda_Runtime_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCompatibleRuntimes_software_amazon_awscdk_services_lambda_Runtime_AsList(
			String newCompatibleRuntimes_software_amazon_awscdk_services_lambda_Runtime_AsList) {
		String oldCompatibleRuntimes_software_amazon_awscdk_services_lambda_Runtime_AsList = compatibleRuntimes_software_amazon_awscdk_services_lambda_Runtime_AsList;
		compatibleRuntimes_software_amazon_awscdk_services_lambda_Runtime_AsList = newCompatibleRuntimes_software_amazon_awscdk_services_lambda_Runtime_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.LAYER_VERSION_BUILDER_LAMBDA__COMPATIBLE_RUNTIMES_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_RUNTIME_AS_LIST,
					oldCompatibleRuntimes_software_amazon_awscdk_services_lambda_Runtime_AsList,
					compatibleRuntimes_software_amazon_awscdk_services_lambda_Runtime_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription_java_lang_String_() {
		return description_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription_java_lang_String_(String newDescription_java_lang_String_) {
		String oldDescription_java_lang_String_ = description_java_lang_String_;
		description_java_lang_String_ = newDescription_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.LAYER_VERSION_BUILDER_LAMBDA__DESCRIPTION_JAVA_LANG_STRING_,
					oldDescription_java_lang_String_, description_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLayerVersionName_java_lang_String_() {
		return layerVersionName_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLayerVersionName_java_lang_String_(String newLayerVersionName_java_lang_String_) {
		String oldLayerVersionName_java_lang_String_ = layerVersionName_java_lang_String_;
		layerVersionName_java_lang_String_ = newLayerVersionName_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.LAYER_VERSION_BUILDER_LAMBDA__LAYER_VERSION_NAME_JAVA_LANG_STRING_,
					oldLayerVersionName_java_lang_String_, layerVersionName_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLicense_java_lang_String_() {
		return license_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLicense_java_lang_String_(String newLicense_java_lang_String_) {
		String oldLicense_java_lang_String_ = license_java_lang_String_;
		license_java_lang_String_ = newLicense_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.LAYER_VERSION_BUILDER_LAMBDA__LICENSE_JAVA_LANG_STRING_,
					oldLicense_java_lang_String_, license_java_lang_String_));
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
					AwsworkbenchPackage.LAYER_VERSION_BUILDER_LAMBDA__VAR_NAME, oldVarName, varName));
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
					AwsworkbenchPackage.LAYER_VERSION_BUILDER_LAMBDA__IDENTIFIER, oldIdentifier, identifier));
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
					AwsworkbenchPackage.LAYER_VERSION_BUILDER_LAMBDA__ADDITIONAL_CODE, oldAdditionalCode,
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
		case AwsworkbenchPackage.LAYER_VERSION_BUILDER_LAMBDA__CODE_WITH_CODE_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_CODE_AS_REFERENCE:
			return getCodeWithCode_software_amazon_awscdk_services_lambda_Code_AsReference();
		case AwsworkbenchPackage.LAYER_VERSION_BUILDER_LAMBDA__COMPATIBLE_RUNTIMES_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_RUNTIME_AS_LIST:
			return getCompatibleRuntimes_software_amazon_awscdk_services_lambda_Runtime_AsList();
		case AwsworkbenchPackage.LAYER_VERSION_BUILDER_LAMBDA__DESCRIPTION_JAVA_LANG_STRING_:
			return getDescription_java_lang_String_();
		case AwsworkbenchPackage.LAYER_VERSION_BUILDER_LAMBDA__LAYER_VERSION_NAME_JAVA_LANG_STRING_:
			return getLayerVersionName_java_lang_String_();
		case AwsworkbenchPackage.LAYER_VERSION_BUILDER_LAMBDA__LICENSE_JAVA_LANG_STRING_:
			return getLicense_java_lang_String_();
		case AwsworkbenchPackage.LAYER_VERSION_BUILDER_LAMBDA__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case AwsworkbenchPackage.LAYER_VERSION_BUILDER_LAMBDA__VAR_NAME:
			return getVarName();
		case AwsworkbenchPackage.LAYER_VERSION_BUILDER_LAMBDA__IDENTIFIER:
			return getIdentifier();
		case AwsworkbenchPackage.LAYER_VERSION_BUILDER_LAMBDA__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.LAYER_VERSION_BUILDER_LAMBDA__CODE_WITH_CODE_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_CODE_AS_REFERENCE:
			setCodeWithCode_software_amazon_awscdk_services_lambda_Code_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.LAYER_VERSION_BUILDER_LAMBDA__COMPATIBLE_RUNTIMES_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_RUNTIME_AS_LIST:
			setCompatibleRuntimes_software_amazon_awscdk_services_lambda_Runtime_AsList((String) newValue);
			return;
		case AwsworkbenchPackage.LAYER_VERSION_BUILDER_LAMBDA__DESCRIPTION_JAVA_LANG_STRING_:
			setDescription_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.LAYER_VERSION_BUILDER_LAMBDA__LAYER_VERSION_NAME_JAVA_LANG_STRING_:
			setLayerVersionName_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.LAYER_VERSION_BUILDER_LAMBDA__LICENSE_JAVA_LANG_STRING_:
			setLicense_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.LAYER_VERSION_BUILDER_LAMBDA__VAR_NAME:
			setVarName((String) newValue);
			return;
		case AwsworkbenchPackage.LAYER_VERSION_BUILDER_LAMBDA__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case AwsworkbenchPackage.LAYER_VERSION_BUILDER_LAMBDA__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.LAYER_VERSION_BUILDER_LAMBDA__CODE_WITH_CODE_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_CODE_AS_REFERENCE:
			setCodeWithCode_software_amazon_awscdk_services_lambda_Code_AsReference(
					CODE_WITH_CODE_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_CODE_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.LAYER_VERSION_BUILDER_LAMBDA__COMPATIBLE_RUNTIMES_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_RUNTIME_AS_LIST:
			setCompatibleRuntimes_software_amazon_awscdk_services_lambda_Runtime_AsList(
					COMPATIBLE_RUNTIMES_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_RUNTIME_AS_LIST_EDEFAULT);
			return;
		case AwsworkbenchPackage.LAYER_VERSION_BUILDER_LAMBDA__DESCRIPTION_JAVA_LANG_STRING_:
			setDescription_java_lang_String_(DESCRIPTION_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.LAYER_VERSION_BUILDER_LAMBDA__LAYER_VERSION_NAME_JAVA_LANG_STRING_:
			setLayerVersionName_java_lang_String_(LAYER_VERSION_NAME_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.LAYER_VERSION_BUILDER_LAMBDA__LICENSE_JAVA_LANG_STRING_:
			setLicense_java_lang_String_(LICENSE_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.LAYER_VERSION_BUILDER_LAMBDA__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.LAYER_VERSION_BUILDER_LAMBDA__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case AwsworkbenchPackage.LAYER_VERSION_BUILDER_LAMBDA__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.LAYER_VERSION_BUILDER_LAMBDA__CODE_WITH_CODE_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_CODE_AS_REFERENCE:
			return CODE_WITH_CODE_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_CODE_AS_REFERENCE_EDEFAULT == null
					? codeWithCode_software_amazon_awscdk_services_lambda_Code_AsReference != null
					: !CODE_WITH_CODE_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_CODE_AS_REFERENCE_EDEFAULT
							.equals(codeWithCode_software_amazon_awscdk_services_lambda_Code_AsReference);
		case AwsworkbenchPackage.LAYER_VERSION_BUILDER_LAMBDA__COMPATIBLE_RUNTIMES_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_RUNTIME_AS_LIST:
			return COMPATIBLE_RUNTIMES_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_RUNTIME_AS_LIST_EDEFAULT == null
					? compatibleRuntimes_software_amazon_awscdk_services_lambda_Runtime_AsList != null
					: !COMPATIBLE_RUNTIMES_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_RUNTIME_AS_LIST_EDEFAULT
							.equals(compatibleRuntimes_software_amazon_awscdk_services_lambda_Runtime_AsList);
		case AwsworkbenchPackage.LAYER_VERSION_BUILDER_LAMBDA__DESCRIPTION_JAVA_LANG_STRING_:
			return DESCRIPTION_JAVA_LANG_STRING__EDEFAULT == null ? description_java_lang_String_ != null
					: !DESCRIPTION_JAVA_LANG_STRING__EDEFAULT.equals(description_java_lang_String_);
		case AwsworkbenchPackage.LAYER_VERSION_BUILDER_LAMBDA__LAYER_VERSION_NAME_JAVA_LANG_STRING_:
			return LAYER_VERSION_NAME_JAVA_LANG_STRING__EDEFAULT == null ? layerVersionName_java_lang_String_ != null
					: !LAYER_VERSION_NAME_JAVA_LANG_STRING__EDEFAULT.equals(layerVersionName_java_lang_String_);
		case AwsworkbenchPackage.LAYER_VERSION_BUILDER_LAMBDA__LICENSE_JAVA_LANG_STRING_:
			return LICENSE_JAVA_LANG_STRING__EDEFAULT == null ? license_java_lang_String_ != null
					: !LICENSE_JAVA_LANG_STRING__EDEFAULT.equals(license_java_lang_String_);
		case AwsworkbenchPackage.LAYER_VERSION_BUILDER_LAMBDA__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case AwsworkbenchPackage.LAYER_VERSION_BUILDER_LAMBDA__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case AwsworkbenchPackage.LAYER_VERSION_BUILDER_LAMBDA__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case AwsworkbenchPackage.LAYER_VERSION_BUILDER_LAMBDA__ADDITIONAL_CODE:
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
		result.append(" (codeWithCode_software_amazon_awscdk_services_lambda_Code_AsReference: ");
		result.append(codeWithCode_software_amazon_awscdk_services_lambda_Code_AsReference);
		result.append(", compatibleRuntimes_software_amazon_awscdk_services_lambda_Runtime_AsList: ");
		result.append(compatibleRuntimes_software_amazon_awscdk_services_lambda_Runtime_AsList);
		result.append(", description_java_lang_String_: ");
		result.append(description_java_lang_String_);
		result.append(", layerVersionName_java_lang_String_: ");
		result.append(layerVersionName_java_lang_String_);
		result.append(", license_java_lang_String_: ");
		result.append(license_java_lang_String_);
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

} //LayerVersionBuilder_lambdaImpl
