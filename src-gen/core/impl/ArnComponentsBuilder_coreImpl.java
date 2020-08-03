/**
 */
package core.impl;

import core.ArnComponentsBuilder_core;
import core.CorePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arn Components Builder core</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link core.impl.ArnComponentsBuilder_coreImpl#getResource_java_lang_String_ <em>Resource java lang String </em>}</li>
 *   <li>{@link core.impl.ArnComponentsBuilder_coreImpl#getService_java_lang_String_ <em>Service java lang String </em>}</li>
 *   <li>{@link core.impl.ArnComponentsBuilder_coreImpl#getAccount_java_lang_String_ <em>Account java lang String </em>}</li>
 *   <li>{@link core.impl.ArnComponentsBuilder_coreImpl#getPartition_java_lang_String_ <em>Partition java lang String </em>}</li>
 *   <li>{@link core.impl.ArnComponentsBuilder_coreImpl#getRegion_java_lang_String_ <em>Region java lang String </em>}</li>
 *   <li>{@link core.impl.ArnComponentsBuilder_coreImpl#getResourceName_java_lang_String_ <em>Resource Name java lang String </em>}</li>
 *   <li>{@link core.impl.ArnComponentsBuilder_coreImpl#getSep_java_lang_String_ <em>Sep java lang String </em>}</li>
 *   <li>{@link core.impl.ArnComponentsBuilder_coreImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link core.impl.ArnComponentsBuilder_coreImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link core.impl.ArnComponentsBuilder_coreImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link core.impl.ArnComponentsBuilder_coreImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArnComponentsBuilder_coreImpl extends MinimalEObjectImpl.Container implements ArnComponentsBuilder_core {
	/**
	 * The default value of the '{@link #getResource_java_lang_String_() <em>Resource java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOURCE_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResource_java_lang_String_() <em>Resource java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String resource_java_lang_String_ = RESOURCE_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getService_java_lang_String_() <em>Service java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getService_java_lang_String_() <em>Service java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String service_java_lang_String_ = SERVICE_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getAccount_java_lang_String_() <em>Account java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccount_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCOUNT_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccount_java_lang_String_() <em>Account java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccount_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String account_java_lang_String_ = ACCOUNT_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getPartition_java_lang_String_() <em>Partition java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartition_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String PARTITION_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPartition_java_lang_String_() <em>Partition java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartition_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String partition_java_lang_String_ = PARTITION_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getRegion_java_lang_String_() <em>Region java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegion_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String REGION_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegion_java_lang_String_() <em>Region java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegion_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String region_java_lang_String_ = REGION_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getResourceName_java_lang_String_() <em>Resource Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOURCE_NAME_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResourceName_java_lang_String_() <em>Resource Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String resourceName_java_lang_String_ = RESOURCE_NAME_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getSep_java_lang_String_() <em>Sep java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSep_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String SEP_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSep_java_lang_String_() <em>Sep java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSep_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String sep_java_lang_String_ = SEP_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.core.ArnComponents";

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
	protected ArnComponentsBuilder_coreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.ARN_COMPONENTS_BUILDER_CORE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getResource_java_lang_String_() {
		return resource_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResource_java_lang_String_(String newResource_java_lang_String_) {
		String oldResource_java_lang_String_ = resource_java_lang_String_;
		resource_java_lang_String_ = newResource_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CorePackage.ARN_COMPONENTS_BUILDER_CORE__RESOURCE_JAVA_LANG_STRING_, oldResource_java_lang_String_,
					resource_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getService_java_lang_String_() {
		return service_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setService_java_lang_String_(String newService_java_lang_String_) {
		String oldService_java_lang_String_ = service_java_lang_String_;
		service_java_lang_String_ = newService_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CorePackage.ARN_COMPONENTS_BUILDER_CORE__SERVICE_JAVA_LANG_STRING_, oldService_java_lang_String_,
					service_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAccount_java_lang_String_() {
		return account_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccount_java_lang_String_(String newAccount_java_lang_String_) {
		String oldAccount_java_lang_String_ = account_java_lang_String_;
		account_java_lang_String_ = newAccount_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CorePackage.ARN_COMPONENTS_BUILDER_CORE__ACCOUNT_JAVA_LANG_STRING_, oldAccount_java_lang_String_,
					account_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPartition_java_lang_String_() {
		return partition_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartition_java_lang_String_(String newPartition_java_lang_String_) {
		String oldPartition_java_lang_String_ = partition_java_lang_String_;
		partition_java_lang_String_ = newPartition_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CorePackage.ARN_COMPONENTS_BUILDER_CORE__PARTITION_JAVA_LANG_STRING_,
					oldPartition_java_lang_String_, partition_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRegion_java_lang_String_() {
		return region_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRegion_java_lang_String_(String newRegion_java_lang_String_) {
		String oldRegion_java_lang_String_ = region_java_lang_String_;
		region_java_lang_String_ = newRegion_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CorePackage.ARN_COMPONENTS_BUILDER_CORE__REGION_JAVA_LANG_STRING_, oldRegion_java_lang_String_,
					region_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getResourceName_java_lang_String_() {
		return resourceName_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResourceName_java_lang_String_(String newResourceName_java_lang_String_) {
		String oldResourceName_java_lang_String_ = resourceName_java_lang_String_;
		resourceName_java_lang_String_ = newResourceName_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CorePackage.ARN_COMPONENTS_BUILDER_CORE__RESOURCE_NAME_JAVA_LANG_STRING_,
					oldResourceName_java_lang_String_, resourceName_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSep_java_lang_String_() {
		return sep_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSep_java_lang_String_(String newSep_java_lang_String_) {
		String oldSep_java_lang_String_ = sep_java_lang_String_;
		sep_java_lang_String_ = newSep_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CorePackage.ARN_COMPONENTS_BUILDER_CORE__SEP_JAVA_LANG_STRING_, oldSep_java_lang_String_,
					sep_java_lang_String_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ARN_COMPONENTS_BUILDER_CORE__VAR_NAME,
					oldVarName, varName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ARN_COMPONENTS_BUILDER_CORE__IDENTIFIER,
					oldIdentifier, identifier));
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
					CorePackage.ARN_COMPONENTS_BUILDER_CORE__ADDITIONAL_CODE, oldAdditionalCode, additionalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CorePackage.ARN_COMPONENTS_BUILDER_CORE__RESOURCE_JAVA_LANG_STRING_:
			return getResource_java_lang_String_();
		case CorePackage.ARN_COMPONENTS_BUILDER_CORE__SERVICE_JAVA_LANG_STRING_:
			return getService_java_lang_String_();
		case CorePackage.ARN_COMPONENTS_BUILDER_CORE__ACCOUNT_JAVA_LANG_STRING_:
			return getAccount_java_lang_String_();
		case CorePackage.ARN_COMPONENTS_BUILDER_CORE__PARTITION_JAVA_LANG_STRING_:
			return getPartition_java_lang_String_();
		case CorePackage.ARN_COMPONENTS_BUILDER_CORE__REGION_JAVA_LANG_STRING_:
			return getRegion_java_lang_String_();
		case CorePackage.ARN_COMPONENTS_BUILDER_CORE__RESOURCE_NAME_JAVA_LANG_STRING_:
			return getResourceName_java_lang_String_();
		case CorePackage.ARN_COMPONENTS_BUILDER_CORE__SEP_JAVA_LANG_STRING_:
			return getSep_java_lang_String_();
		case CorePackage.ARN_COMPONENTS_BUILDER_CORE__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case CorePackage.ARN_COMPONENTS_BUILDER_CORE__VAR_NAME:
			return getVarName();
		case CorePackage.ARN_COMPONENTS_BUILDER_CORE__IDENTIFIER:
			return getIdentifier();
		case CorePackage.ARN_COMPONENTS_BUILDER_CORE__ADDITIONAL_CODE:
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
		case CorePackage.ARN_COMPONENTS_BUILDER_CORE__RESOURCE_JAVA_LANG_STRING_:
			setResource_java_lang_String_((String) newValue);
			return;
		case CorePackage.ARN_COMPONENTS_BUILDER_CORE__SERVICE_JAVA_LANG_STRING_:
			setService_java_lang_String_((String) newValue);
			return;
		case CorePackage.ARN_COMPONENTS_BUILDER_CORE__ACCOUNT_JAVA_LANG_STRING_:
			setAccount_java_lang_String_((String) newValue);
			return;
		case CorePackage.ARN_COMPONENTS_BUILDER_CORE__PARTITION_JAVA_LANG_STRING_:
			setPartition_java_lang_String_((String) newValue);
			return;
		case CorePackage.ARN_COMPONENTS_BUILDER_CORE__REGION_JAVA_LANG_STRING_:
			setRegion_java_lang_String_((String) newValue);
			return;
		case CorePackage.ARN_COMPONENTS_BUILDER_CORE__RESOURCE_NAME_JAVA_LANG_STRING_:
			setResourceName_java_lang_String_((String) newValue);
			return;
		case CorePackage.ARN_COMPONENTS_BUILDER_CORE__SEP_JAVA_LANG_STRING_:
			setSep_java_lang_String_((String) newValue);
			return;
		case CorePackage.ARN_COMPONENTS_BUILDER_CORE__VAR_NAME:
			setVarName((String) newValue);
			return;
		case CorePackage.ARN_COMPONENTS_BUILDER_CORE__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case CorePackage.ARN_COMPONENTS_BUILDER_CORE__ADDITIONAL_CODE:
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
		case CorePackage.ARN_COMPONENTS_BUILDER_CORE__RESOURCE_JAVA_LANG_STRING_:
			setResource_java_lang_String_(RESOURCE_JAVA_LANG_STRING__EDEFAULT);
			return;
		case CorePackage.ARN_COMPONENTS_BUILDER_CORE__SERVICE_JAVA_LANG_STRING_:
			setService_java_lang_String_(SERVICE_JAVA_LANG_STRING__EDEFAULT);
			return;
		case CorePackage.ARN_COMPONENTS_BUILDER_CORE__ACCOUNT_JAVA_LANG_STRING_:
			setAccount_java_lang_String_(ACCOUNT_JAVA_LANG_STRING__EDEFAULT);
			return;
		case CorePackage.ARN_COMPONENTS_BUILDER_CORE__PARTITION_JAVA_LANG_STRING_:
			setPartition_java_lang_String_(PARTITION_JAVA_LANG_STRING__EDEFAULT);
			return;
		case CorePackage.ARN_COMPONENTS_BUILDER_CORE__REGION_JAVA_LANG_STRING_:
			setRegion_java_lang_String_(REGION_JAVA_LANG_STRING__EDEFAULT);
			return;
		case CorePackage.ARN_COMPONENTS_BUILDER_CORE__RESOURCE_NAME_JAVA_LANG_STRING_:
			setResourceName_java_lang_String_(RESOURCE_NAME_JAVA_LANG_STRING__EDEFAULT);
			return;
		case CorePackage.ARN_COMPONENTS_BUILDER_CORE__SEP_JAVA_LANG_STRING_:
			setSep_java_lang_String_(SEP_JAVA_LANG_STRING__EDEFAULT);
			return;
		case CorePackage.ARN_COMPONENTS_BUILDER_CORE__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case CorePackage.ARN_COMPONENTS_BUILDER_CORE__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case CorePackage.ARN_COMPONENTS_BUILDER_CORE__ADDITIONAL_CODE:
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
		case CorePackage.ARN_COMPONENTS_BUILDER_CORE__RESOURCE_JAVA_LANG_STRING_:
			return RESOURCE_JAVA_LANG_STRING__EDEFAULT == null ? resource_java_lang_String_ != null
					: !RESOURCE_JAVA_LANG_STRING__EDEFAULT.equals(resource_java_lang_String_);
		case CorePackage.ARN_COMPONENTS_BUILDER_CORE__SERVICE_JAVA_LANG_STRING_:
			return SERVICE_JAVA_LANG_STRING__EDEFAULT == null ? service_java_lang_String_ != null
					: !SERVICE_JAVA_LANG_STRING__EDEFAULT.equals(service_java_lang_String_);
		case CorePackage.ARN_COMPONENTS_BUILDER_CORE__ACCOUNT_JAVA_LANG_STRING_:
			return ACCOUNT_JAVA_LANG_STRING__EDEFAULT == null ? account_java_lang_String_ != null
					: !ACCOUNT_JAVA_LANG_STRING__EDEFAULT.equals(account_java_lang_String_);
		case CorePackage.ARN_COMPONENTS_BUILDER_CORE__PARTITION_JAVA_LANG_STRING_:
			return PARTITION_JAVA_LANG_STRING__EDEFAULT == null ? partition_java_lang_String_ != null
					: !PARTITION_JAVA_LANG_STRING__EDEFAULT.equals(partition_java_lang_String_);
		case CorePackage.ARN_COMPONENTS_BUILDER_CORE__REGION_JAVA_LANG_STRING_:
			return REGION_JAVA_LANG_STRING__EDEFAULT == null ? region_java_lang_String_ != null
					: !REGION_JAVA_LANG_STRING__EDEFAULT.equals(region_java_lang_String_);
		case CorePackage.ARN_COMPONENTS_BUILDER_CORE__RESOURCE_NAME_JAVA_LANG_STRING_:
			return RESOURCE_NAME_JAVA_LANG_STRING__EDEFAULT == null ? resourceName_java_lang_String_ != null
					: !RESOURCE_NAME_JAVA_LANG_STRING__EDEFAULT.equals(resourceName_java_lang_String_);
		case CorePackage.ARN_COMPONENTS_BUILDER_CORE__SEP_JAVA_LANG_STRING_:
			return SEP_JAVA_LANG_STRING__EDEFAULT == null ? sep_java_lang_String_ != null
					: !SEP_JAVA_LANG_STRING__EDEFAULT.equals(sep_java_lang_String_);
		case CorePackage.ARN_COMPONENTS_BUILDER_CORE__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case CorePackage.ARN_COMPONENTS_BUILDER_CORE__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case CorePackage.ARN_COMPONENTS_BUILDER_CORE__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case CorePackage.ARN_COMPONENTS_BUILDER_CORE__ADDITIONAL_CODE:
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
		result.append(" (resource_java_lang_String_: ");
		result.append(resource_java_lang_String_);
		result.append(", service_java_lang_String_: ");
		result.append(service_java_lang_String_);
		result.append(", account_java_lang_String_: ");
		result.append(account_java_lang_String_);
		result.append(", partition_java_lang_String_: ");
		result.append(partition_java_lang_String_);
		result.append(", region_java_lang_String_: ");
		result.append(region_java_lang_String_);
		result.append(", resourceName_java_lang_String_: ");
		result.append(resourceName_java_lang_String_);
		result.append(", sep_java_lang_String_: ");
		result.append(sep_java_lang_String_);
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

} //ArnComponentsBuilder_coreImpl
