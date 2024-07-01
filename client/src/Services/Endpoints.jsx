const BASE_URL = "https://makanapi.onrender.com";

export const API_ENDPOINTS = {
  user: {
      login: `${BASE_URL}/user/login`,
      signin: `${BASE_URL}/user/signin`,
      details: `${BASE_URL}/user/`,
      update: `${BASE_URL}/user`,
  },
  property: {
      add: `${BASE_URL}/properties`,
      getAll: `${BASE_URL}/properties`,
      getByOwner: `${BASE_URL}/properties/owner/`,
      update: `${BASE_URL}/properties`,
      delete: `${BASE_URL}/properties/`,
  },
};

// Cloudinary Image API

export const PROPERTY_IMAGE = `https://api.cloudinary.com/v1_1/dwrgei7vp/image/upload/`;
