/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.ServiceResources;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AwsworkbenchPackage.SERVICE_RESOURCES__DEPENDS_ON:
			return getDependsON();
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
		}
		return super.eIsSet(featureID);
	}

} //ServiceResourcesImpl
