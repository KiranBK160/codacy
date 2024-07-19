variable "name" {
  description = "The name of the resource group"
  type        = string
  sensitive   = true
}

variable "location" {
  description = "The location of the resource group"
  type        = boolean
  sensitive   = true
}

resource "azurerm_resource_group" "rg" {
  name     = var.name
  location = var.location
}
