/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.ServiceResources;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Resources</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ServiceResourcesImpl#getDependsON <em>Depends ON</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ServiceResourcesImpl#getImportExistingResource <em>Import Existing Resource</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ServiceResourcesImpl extends MinimalEObjectImpl.Container implements ServiceResources {
	/**
	 * The cached value of the '{@link #getDependsON() <em>Depends ON</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependsON()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceResources> dependsON;

	/**
	 * The default value of the '{@link #getImportExistingResource() <em>Import Existing Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportExistingResource()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPORT_EXISTING_RESOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImportExistingResource() <em>Import Existing Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportExistingResource()
	 * @generated
	 * @ordered
	 */
	protected String importExistingResource = IMPORT_EXISTING_RESOURCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceResourcesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsworkbenchPackage.Literals.SERVICE_RESOURCES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ServiceResources> getDependsON() {
		if (dependsON == null) {
			dependsON = new EObjectResolvingEList<ServiceResources>(ServiceResources.class, this,
					AwsworkbenchPackage.SERVICE_RESOURCES__DEPENDS_ON);
		}
		return dependsON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImportExistingResource() {
		return importExistingResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImportExistingResource(String newImportExistingResource) {
		String oldImportExistingResource = importExistingResource;
		importExistingResource = newImportExistingResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.SERVICE_RESOURCES__IMPORT_EXISTING_RESOURCE, oldImportExistingResource,
					importExistingResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AwsworkbenchPackage.SERVICE_RESOURCES__DEPENDS_ON:
			return getDependsON();
		case AwsworkbenchPackage.SERVICE_RESOURCES__IMPORT_EXISTING_RESOURCE:
			return getImportExistingResource();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case AwsworkbenchPackage.SERVICE_RESOURCES__DEPENDS_ON:
			getDependsON().clear();
			getDependsON().addAll((Collection<? extends ServiceResources>) newValue);
			return;
		case AwsworkbenchPackage.SERVICE_RESOURCES__IMPORT_EXISTING_RESOURCE:
			setImportExistingResource((String) newValue);
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
		case AwsworkbenchPackage.SERVICE_RESOURCES__DEPENDS_ON:
			getDependsON().clear();
			return;
		case AwsworkbenchPackage.SERVICE_RESOURCES__IMPORT_EXISTING_RESOURCE:
			setImportExistingResource(IMPORT_EXISTING_RESOURCE_EDEFAULT);
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
		case AwsworkbenchPackage.SERVICE_RESOURCES__DEPENDS_ON:
			return dependsON != null && !dependsON.isEmpty();
		case AwsworkbenchPackage.SERVICE_RESOURCES__IMPORT_EXISTING_RESOURCE:
			return IMPORT_EXISTING_RESOURCE_EDEFAULT == null ? importExistingResource != null
					: !IMPORT_EXISTING_RESOURCE_EDEFAULT.equals(importExistingResource);
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
		result.append(" (importExistingResource: ");
		result.append(importExistingResource);
		result.append(')');
		return result.toString();
	}

} //ServiceResourcesImpl
