# Billing Service

A Java-based billing module designed to calculate order totals and coordinate with shipping services. This project demonstrates basic principles of **Dependency Injection** and **Service-Oriented Architecture**.

---

## 📊 System Design

The following UML diagram illustrates the relationship between the core entities and services within this module:

<p align="center">
  <img src="./Screenshot from 2026-02-24 11-23-05.png" alt="Billing Service Class Diagram" width="600">
</p>
## Core Components

* **Order (Entity):** A data object containing the unique `code`, the `basic` price, and the `discount` percentage.
* **OrderService:** Responsible for calculating the final total of an order. It depends on the `ShippingService` to factor in delivery costs.
* **ShippingService:** Calculates the shipment cost based on the order's properties.

---

## 🛠️ Technical Specifications

## Data Model: `Order`
| Attribute | Type | Description |
| :--- | :--- | :--- |
| `code` | `Integer` | Unique identifier for the order. |
| `basic` | `Double` | The base price before discounts and shipping. |
| `discount` | `Double` | The discount percentage (e.g., 10.0 for 10%). |

### Business Logic
The `OrderService` calculates the final amount using the following logic:
$$Total = (Basic \times (1 - \frac{Discount}{100})) + Shipment$$

---

## 🚀 Getting Started

1. **Clone the repository:**
   ```bash
   git clone https://github.com/Medeiroshenrique/billing-service
