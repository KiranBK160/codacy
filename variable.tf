variable "name" {
  description = "The name of the resource group"
  type        = string
}

variable "location" {
  description = "The location of the resource group"
  type        = string
}

resource "azurerm_resource_group" "rg" {
  name     = var.name
  location = var.location
}
